/**
* @FileName: QrcodeDoc.java
* @Package: com.hro.qrdoc
* @Copyright: 2018 io.github.bincool Inc. All Rights Reserved.
* @Description: QrcodeDoc.java: 二维码装箱文档生成.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月1日 下午12:53:24.
* @Content: 新增.
* @Version: V1.0.
*/
package com.hro.qrdoc;

import java.awt.EventQueue;

import org.apache.log4j.Logger;

import com.hro.qrdoc.runnable.QrcodeDocRunnable;

/**
* @ClassName: QrcodeDoc.java
* 
* @Description: 
* <p>
* 二维码装箱文档生成：每箱个数，订单号，大箱码，产品二维码.
* </p>
* <p>
* 详细描述.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年6月1日 下午12:53:24.
* 
*/
public class QrcodeDoc 
{

	/**
	 * 日志对象.
	 */
	private static final Logger LOGGER = Logger.getLogger(QrcodeDoc.class);
	
	/**
	 * 主方法. Launch the application.
	 */
	public static void main(String[] args) 
	{
		LOGGER.info("Begin to run the system.");
		QrcodeDocRunnable qrcodeDocRunnable = new QrcodeDocRunnable();
		EventQueue.invokeLater(qrcodeDocRunnable);
		LOGGER.info("End to run the system.");
	}
	
}
