/**
* @FileName: QrcodeDocRunnable.java
* @Package: com.hro.qrdoc.runnable
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: QrcodeDocRunnable.java: ��ά��ɨ��鵵�߳�.
* @Author wchy����������(891946049).
* @Date 2018��6��4�� ����12:55:54.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.runnable;

import javax.swing.UIManager;

import org.apache.log4j.Logger;

import com.hro.qrdoc.ui.QrcodeDocFrame;

/**
* @ClassName: QrcodeDocRunnable.java
* 
* @Description: 
* <p>
* ��ά��ɨ��鵵�߳�.
* </p>
* <p>
* ��ϸ����.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��6��4�� ����12:55:54.
* 
*/
public class QrcodeDocRunnable implements Runnable 
{
	
	/**
	 * ��־����.
	 */
	private static final Logger LOGGER = Logger.getLogger(QrcodeDocRunnable.class);

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() 
	{
		try 
		{
			// ���öԻ���ķ��.
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

			// ����һ�����±�����.
			QrcodeDocFrame window = new QrcodeDocFrame();
			window.getFrame().setVisible(true);
		} 
		catch (Exception e) 
		{
			LOGGER.error("System error, " + e);
		}
	}

}
