/**
* @FileName: QrcodeDocRunnable.java
* @Package: com.hro.qrdoc.runnable
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: QrcodeDocRunnable.java: TODO 一句话描述文件的作用.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月4日 下午12:55:54.
* @Content: 新增.
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
* TODO 一句话对这个类进行描述.
* </p>
* <p>
* TODO 详细描述.
* </p>
* <p>
* TODO 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年6月4日 下午12:55:54.
* 
*/
public class QrcodeDocRunnable implements Runnable 
{
	
	/**
	 * 日志对象.
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
			// 设置对话框的风格.
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

			// 创建一个记事本对象.
			QrcodeDocFrame window = new QrcodeDocFrame();
			window.getFrame().setVisible(true);
		} 
		catch (Exception e) 
		{
			LOGGER.error("System error, " + e);
		}
	}

}
