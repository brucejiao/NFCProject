package com.company.Demo;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class PlayView extends GLSurfaceView 
{
	int m_nViewWidth = 300;
	int m_nViewHeight = 300;

	public class PlayRender implements Renderer
	{
		Context mContext;
		private int[] m_glTexture = new int[1];
		private int mRgb = GL10.GL_RGBA;
		private int m_glTextureSize = 1024;
		private ByteBuffer m_rgbSource = ByteBuffer.allocate(1024 * 1024 * 4);

		/** The buffer holding the vertices */
		private FloatBuffer m_verticesBuffer;
		/** The buffer holding the texture coordinates */
		private FloatBuffer m_coordinatesBuffer;

		Lock lock = new ReentrantLock();

		int m_nVideoWidth  = 640;
		int m_nVideoHeight = 480;

		PlayRender(Context context)
		{
			mContext = context;
		}

		@Override
		public void onSurfaceCreated(GL10 gl, EGLConfig config)
		{
			ByteBuffer byteBuf = ByteBuffer.allocateDirect(48);
			byteBuf.order(ByteOrder.nativeOrder());
			m_verticesBuffer = byteBuf.asFloatBuffer();

			byteBuf = ByteBuffer.allocateDirect(32);
			byteBuf.order(ByteOrder.nativeOrder());
			m_coordinatesBuffer = byteBuf.asFloatBuffer();

			gl.glEnable(GL10.GL_TEXTURE_2D);
			gl.glGenTextures(1, m_glTexture, 0);
			gl.glBindTexture(GL10.GL_TEXTURE_2D, m_glTexture[0]);
			gl.glTexImage2D(GL10.GL_TEXTURE_2D, 0, mRgb, m_glTextureSize, m_glTextureSize, 0, mRgb, GL10.GL_UNSIGNED_BYTE, m_rgbSource);
			gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MIN_FILTER, GL10.GL_LINEAR);
			gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MAG_FILTER, GL10.GL_LINEAR);
		}

		boolean flag = true;
		@Override
		public void onDrawFrame(GL10 gl) {
			gl.glEnable(GL10.GL_TEXTURE_2D);

			gl.glBindTexture(GL10.GL_TEXTURE_2D, m_glTexture[0]);
			lock.lock();
			m_rgbSource.position(0);
			gl.glTexSubImage2D(GL10.GL_TEXTURE_2D, 0, mRgb, m_nVideoWidth,
					m_nVideoHeight, 0, mRgb, GL10.GL_UNSIGNED_BYTE,
					m_rgbSource);
			lock.unlock();

			gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MIN_FILTER,
					GL10.GL_LINEAR);
			gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MAG_FILTER,
					GL10.GL_LINEAR);

			// 图形最终显示到屏幕的区域的位置、长和宽
			gl.glViewport(0, 0, m_nViewWidth, m_nViewHeight);

			// 指定矩阵
			gl.glMatrixMode(GL10.GL_PROJECTION);

			// 将当前的矩阵设置为glMatrixMode指定的矩阵
			gl.glLoadIdentity();

			gl.glOrthof(0, m_nViewWidth, 0, m_nViewHeight, -1, 1);
			gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
			gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

			gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
			gl.glEnableClientState(GL10.GL_TEXTURE_COORD_ARRAY);

			float coordinates[] = { 0,
					(float) m_nVideoHeight / (float) m_glTextureSize,
					(float) m_nVideoWidth / (float) m_glTextureSize,
					(float) m_nVideoHeight / (float) m_glTextureSize, 0, 0,
					(float) m_nVideoWidth / (float) m_glTextureSize, 0 };
			m_coordinatesBuffer.put(coordinates);
			m_coordinatesBuffer.position(0);

			float vertices[] = { 0, 0, (float) 0.0, m_nViewWidth, 0,
					(float) 0.0, 0, m_nViewHeight, (float) 0.0, m_nViewWidth,
					m_nViewHeight, (float) 0.0 };
			m_verticesBuffer.put(vertices);
			m_verticesBuffer.position(0);
			gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
			gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

			gl.glViewport(0, 0, m_nViewWidth, m_nViewHeight);
			// 贴纹理，显示
			gl.glBindTexture(GL10.GL_TEXTURE_2D, m_glTexture[0]);
			gl.glTexSubImage2D(GL10.GL_TEXTURE_2D, 0, 0, 0, m_nVideoWidth,
					m_nVideoHeight, GL10.GL_RGBA, GL10.GL_UNSIGNED_BYTE,
					m_rgbSource);

			gl.glTexCoordPointer(2, GL10.GL_FLOAT, 0, m_coordinatesBuffer);
			gl.glVertexPointer(3, GL10.GL_FLOAT, 0, m_verticesBuffer);

			gl.glDrawArrays(GL10.GL_TRIANGLE_STRIP, 0, 4);
		}

		@Override
		public void onSurfaceChanged(GL10 gl, int width, int height) {
			m_nViewWidth  = width;
			m_nViewHeight = height;

			gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MIN_FILTER, GL10.GL_LINEAR);
			gl.glTexParameterf(GL10.GL_TEXTURE_2D, GL10.GL_TEXTURE_MAG_FILTER, GL10.GL_LINEAR);

			// 图形最终显示到屏幕的区域的位置、长和宽
			gl.glViewport(0, 0, width, height);

			// 指定矩阵
			gl.glMatrixMode(GL10.GL_PROJECTION);

			// 将当前的矩阵设置为glMatrixMode指定的矩阵
			gl.glLoadIdentity();

			gl.glOrthof(0, m_nViewWidth, 0, m_nViewHeight, -1, 1);
			gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
			gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

			gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
			gl.glEnableClientState(GL10.GL_TEXTURE_COORD_ARRAY);

			float coordinates[] = { 0,
					(float) m_nVideoHeight / (float) m_glTextureSize,
					(float) m_nVideoWidth / (float) m_glTextureSize,
					(float) m_nVideoHeight / (float) m_glTextureSize, 0, 0,
					(float) m_nVideoWidth / (float) m_glTextureSize, 0 };
			m_coordinatesBuffer.put(coordinates);
			m_coordinatesBuffer.position(0);

			float vertices[] = { 0, 0, (float) 0.0, m_nViewWidth, 0, (float) 0.0,
					0, m_nViewHeight, (float) 0.0, m_nViewWidth, m_nViewHeight,
					(float) 0.0 };
			m_verticesBuffer.put(vertices);
			m_verticesBuffer.position(0);
		}

		public void upDataTexture(byte[] pBuffer)
		{
			lock.lock();
			m_rgbSource.position(0);
			m_rgbSource.put(pBuffer);
			lock.unlock();
		}
	}

	Queue<Bitmap> m_imageQueue = new LinkedList<Bitmap>();

	private PlayRender playRender = null;

	public PlayView(Context context)
	{
		this(context, null);
	}

	public PlayView(Context context, AttributeSet attrs)
	{
		this(context, attrs, 0);
	}

	public PlayView(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs);

		setEGLContextClientVersion(1);

		playRender = new PlayRender(context);

		setRenderer(playRender);
	}

	public void drawColor(byte[] pBuffer)
	{
		playRender.upDataTexture(pBuffer);
	}
}
