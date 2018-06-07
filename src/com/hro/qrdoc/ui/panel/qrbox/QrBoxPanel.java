/**
* @FileName: QrBoxPanel.java
* @Package: com.hro.qrdoc.ui.panel.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: QrBoxPanel.java: 二维码装箱扫描panel.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月7日 上午10:40:17.
* @Content: 新增.
* @Version: V1.0.
*/
package com.hro.qrdoc.ui.panel.qrbox;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.hro.qrdoc.ui.panel.base.DefaultInputPanel;

/**
* @ClassName: QrBoxPanel.java
* 
* @Description: 
* <p>
* 二维码装箱扫描panel.
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
* @Date: 2018年6月7日 上午10:40:17.
* 
*/
public class QrBoxPanel extends JPanel 
{

	/**
	 * 序列版本号.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 无参构造函数.
	 */
	public QrBoxPanel() 
	{
		initialContext();
	}
	
	/**
	 * 初始化二维码装箱panel.
	 */
	private void initialContext() 
	{
		this.setLayout(null);
		
		// 计数输入框.
		JLabel countLabel = new JLabel("每箱个数：");
		countLabel.setBounds(25, 20, 70, 30);
		DefaultInputPanel countPanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
		countPanel.setBounds(80, 20, 190, 30);
		this.add(countLabel);
		this.add(countPanel);
		
		// 订单输入框.
		JLabel orderNumLabel = new JLabel("订单编号：");
		orderNumLabel.setBounds(25, 60, 70, 30);
		DefaultInputPanel orderNumPanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
		orderNumPanel.setBounds(80, 60, 190, 30);
		this.add(orderNumLabel);
		this.add(orderNumPanel);
		
		// 大箱码输入框.
		JLabel bigBoxCodeLabel = new JLabel("大箱条码：");
		bigBoxCodeLabel.setBounds(25, 100, 70, 30);
		DefaultInputPanel bigBoxCodePanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
		bigBoxCodePanel.setBounds(80, 100, 190, 30);
		this.add(bigBoxCodeLabel);
		this.add(bigBoxCodePanel);
		
		// 二维码文本域.
		JLabel qrCodeTextLabel = new JLabel("装箱二维码：已装箱 {0} 箱 {0} 个") ;
		qrCodeTextLabel.setBounds(25, 140, 745, 30);
		JTextArea qrCodeText = new JTextArea();
		qrCodeText.setBounds(25, 180, 745, 330);
		this.add(qrCodeTextLabel);
		this.add(qrCodeText);
		
		// 下一箱按钮.
		JButton nextBtn = new JButton("下一箱");
		nextBtn.setBounds(300, 525, 80, 30);
		this.add(nextBtn);
		
		// 结束按钮.
		JButton finishBtn = new JButton("结束");
		finishBtn.setBounds(390, 525, 80, 30);
		this.add(finishBtn);
	}

}
