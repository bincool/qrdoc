/**
* @FileName: DefaultInputPanel.java
* @Package: com.hro.qrdoc.ui.panel.base
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: DefaultInputPanel.java: 圆角input框.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月6日 上午11:23:13.
* @Content: 新增.
* @Version: V1.0.
*/
package com.hro.qrdoc.ui.panel.base;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.hro.qrdoc.action.listener.CancelBtnMouseAdapter;
import com.hro.qrdoc.action.listener.DefaultInputMouseAdapter;
import com.hro.qrdoc.action.qrbox.CancelBtnAction;
import com.hro.qrdoc.constant.ApplicationConstant;

/**
* @ClassName: DefaultInputPanel.java
* 
* @Description: 
* <p>
* 圆角input框.
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
* @Date: 2018年6月6日 上午11:23:13.
* 
*/
public class DefaultInputPanel extends JPanel 
{

	/**
	 * 序列版本号.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 正常颜色.
	 */
	private Color normalColor = Color.LIGHT_GRAY;
	
	/**
	 * 输入框边框颜色.
	 */
	private Color borderColor = Color.LIGHT_GRAY;
	
	/**
	 * 边框绘制控制：true表示绘制边框，false表示默认边框.
	 */
	private boolean borderFlag = false;
	
	/**
	 * 文本输入框.
	 */
	private JTextField inputText = new JTextField();
	
	/**
	 * 输入框默认宽.
	 */
	private int width = 153;
	
	/**
	 * 输入框默认高.
	 */
	private int height = 17;
	
	/**
	 * 取消按钮.
	 */
	private JButton cancelBtn = new JButton(new ImageIcon(Toolkit.getDefaultToolkit().getImage(ApplicationConstant.FRAME_CANCEL_HIDE_PATH)));
	
	/**
	 * 无参构造函数.
	 */
	public DefaultInputPanel() 
	{
		initLayout();
		initAction();
	}
	
	/**
	 * 有参构造函数.
	 * @param normalColor
	 * @param borderColor
	 */
	public DefaultInputPanel(Color normalColor, Color borderColor) 
	{
		this.normalColor = normalColor;
		this.borderColor = borderColor;
		initLayout();
		initAction();
	}

	/**
	 * 设置borderFlag.
	 * @param
	 *     borderFlag.
	 */
	public void setBorderFlag(boolean borderFlag) 
	{
		this.borderFlag = borderFlag;
	}

	/**
	 * 获取borderFlag.
	 * @return
	 *     borderFlag.
	 */
	public boolean isBorderFlag() 
	{
		return borderFlag;
	}
	
	/**
	 * 初始化输入框布局，可以被子类继承.
	 */
	protected void initLayout() 
	{
		this.setLayout(null);
		
		// 输入框布局.
		inputText.setBounds(7, 0, width, 13 + height);
		inputText.setOpaque(false);
		inputText.setBorder(null);
		this.add(inputText);
		
		// 取消重置按钮布局.
		cancelBtn.setBounds(7 + width, 0, 30, 13 + height);
		cancelBtn.setBorder(null);
		cancelBtn.setBorderPainted(false);
		cancelBtn.setContentAreaFilled(false);
		cancelBtn.setFocusPainted(false);
        this.add(cancelBtn);
	}
	
	/**
	 * 初始化输入框事件，可以被子类继承.
	 */
	protected void initAction() 
	{
		// 输入框鼠标事件.
		DefaultInputMouseAdapter countListener = new DefaultInputMouseAdapter(this);
		inputText.addMouseListener(countListener);
		
		// 取消重置按钮事件.
		cancelBtn.addActionListener(new CancelBtnAction());
		CancelBtnMouseAdapter cancelBtnListener = new CancelBtnMouseAdapter(cancelBtn);
		cancelBtn.addMouseListener(cancelBtnListener);
	}
	
	/* (non-Javadoc)
	 * @see java.awt.Component#setBounds(int, int, int, int)
	 */
	@Override
	public void setBounds(int x, int y, int width, int height) 
	{
		super.setBounds(x, y, width, height);
		this.width = width - 37;
		this.height = height - 13;
		initLayout();
	}

	/* (non-Javadoc)
	 * @see java.awt.Component#setBounds(java.awt.Rectangle)
	 */
	@Override
	public void setBounds(Rectangle r) 
	{
		super.setBounds(r);
		this.width = width - 37;
		this.height = height - 13;
		initLayout();
	}

	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		// 设置着色微调.
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		// 画一个外层矩形.
		g2.setColor(Color.white);
		g2.fillRoundRect(0, 0, 37 + width, 13 + height, 10, 10);
		
		// 画一个内层矩形,用于放置JText.
		g2.fillRect(0, 0, 37 + width, height);
		
		// 边框.
		BasicStroke basicStroke = new BasicStroke(1.0f);
		g2.setStroke(basicStroke);
		
		if(borderFlag) 
		{
			// 为该矩形添加边框颜色.
			g2.setColor(borderColor);
		}
		else 
		{
			g2.setColor(normalColor);
		}
		
		// 圆角矩形框.
		g2.drawLine(0, 5, 0, 8 + height);
        g2.drawLine(36 + width, 5, 36 + width, 8 + height);
        g2.drawLine(5, 0, 32 + width, 0);
        g2.drawLine(5, 12 + height, 32 + width, 12 + height);
        g2.drawArc(0, 0, 10, 10, 180, -90);
        g2.drawArc(26 + width, 0, 10, 10, 90, -90);
        g2.drawArc(0, 1 + height, 10, 10, 180, 90);
        g2.drawArc(26 + width, 1 + height, 10, 10, 270, 90);
	}
	
}
