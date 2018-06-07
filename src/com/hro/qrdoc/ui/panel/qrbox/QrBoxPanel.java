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

import com.hro.qrdoc.action.base.BaseAction;
import com.hro.qrdoc.constant.ApplicationConstant;
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
	 * 计数输入框提示标签.
	 */
	private JLabel countLabel = new JLabel(ApplicationConstant.LABEL_TITLE_COUNT);
	
	/**
	 * 计数输入框.
	 */
	private DefaultInputPanel countPanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
	
	/**
	 * 订单编号输入框提示标签.
	 */
	private JLabel orderNumLabel = new JLabel(ApplicationConstant.LABEL_TITLE_ORDERNUM);
	
	/**
	 * 订单编号输入框.
	 */
	private DefaultInputPanel orderNumPanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
	
	/**
	 * 大箱条码输入框.
	 */
	private JLabel bigBoxCodeLabel = new JLabel(ApplicationConstant.LABEL_TITLE_BIGBOXCODE);
	
	/**
	 * 大箱条码输入框提示标签.
	 */
	private DefaultInputPanel bigBoxCodePanel = new DefaultInputPanel(Color.LIGHT_GRAY, new Color(56, 172, 239));
	
	/**
	 * 装箱二维码文本域提示标签.
	 */
	private JLabel qrCodeTextLabel = new JLabel(ApplicationConstant.LABEL_TITLE_QRCODETEXT);
	
	/**
	 * 装箱二维码文本域.
	 */
	private JTextArea qrCodeText = new JTextArea();
	
	/**
	 * 下一箱按钮.
	 */
	private JButton nextBtn = new JButton(ApplicationConstant.BUTTON_TITLE_NEXTBTN);
	
	/**
	 * 结束按钮.
	 */
	private JButton finishBtn = new JButton(ApplicationConstant.BUTTON_TITLE_FINISHBTN);
	
	/**
	 * 无参构造函数.
	 */
	public QrBoxPanel() 
	{
		initLayout();
	}
	
	/**
	 * 初始化二维码装箱panel.
	 */
	private void initLayout() 
	{
		this.setLayout(null);
		
		// 计数输入框.
		countLabel.setBounds(25, 20, 70, 35);
		countPanel.setBounds(80, 20, 300, 35);
		this.add(countLabel);
		this.add(countPanel);
		
		// 订单号输入框.
		orderNumLabel.setBounds(25, 60, 70, 35);
		orderNumPanel.setBounds(80, 60, 300, 35);
		this.add(orderNumLabel);
		this.add(orderNumPanel);
		
		// 大箱码输入框.
		bigBoxCodeLabel.setBounds(25, 100, 70, 35);
		bigBoxCodePanel.setBounds(80, 100, 300, 35);
		this.add(bigBoxCodeLabel);
		this.add(bigBoxCodePanel);
		
		// 二维码文本域.
		qrCodeTextLabel.setBounds(25, 140, 745, 30);
		qrCodeText.setBounds(25, 180, 745, 330);
		this.add(qrCodeTextLabel);
		this.add(qrCodeText);
		
		// 下一箱按钮.
		nextBtn.setBounds(300, 525, 80, 30);
		this.add(nextBtn);
		
		// 结束按钮.
		finishBtn.setBounds(390, 525, 80, 30);
		this.add(finishBtn);
	}

	/**
	 * 初始化二维码装箱事件绑定.
	 */
	protected void initAction() 
	{
		// 下一箱按钮.
		nextBtn.addActionListener(new BaseAction());
		
		// 结束按钮.
		finishBtn.addActionListener(new BaseAction());
	}
	
}
