/**
* @FileName: DefaultInputPanel.java
* @Package: com.hro.qrdoc.ui.panel.base
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: DefaultInputPanel.java: Բ��input��.
* @Author wchy����������(891946049).
* @Date 2018��6��6�� ����11:23:13.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.ui.panel.base;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.hro.qrdoc.action.base.BaseAction;
import com.hro.qrdoc.action.listener.DefaultInputMouseAdapter;
import com.hro.qrdoc.constant.ApplicationConstant;

/**
* @ClassName: DefaultInputPanel.java
* 
* @Description: 
* <p>
* Բ��input��.
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
* @Date: 2018��6��6�� ����11:23:13.
* 
*/
public class DefaultInputPanel extends JPanel 
{

	/**
	 * ���а汾��.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * ������ɫ.
	 */
	private Color normalColor = Color.LIGHT_GRAY;
	
	/**
	 * �߿���ɫ.
	 */
	private Color borderColor = Color.LIGHT_GRAY;
	
	/**
	 * �߿���ƿ��ƣ�true��ʾ���Ʊ߿�false��ʾĬ�ϱ߿�.
	 */
	private boolean borderFlag = false;
	
	/**
	 * �ı������.
	 */
	private JTextField inputText = new JTextField();
	
	/**
	 * ȡ����ť.
	 */
	private JButton cancelBtn = new JButton(new ImageIcon(Toolkit.getDefaultToolkit().getImage(ApplicationConstant.FRAME_CANCEL_SHOW_PATH)));
	
	/**
	 * �޲ι��캯��.
	 */
	public DefaultInputPanel() 
	{
		initialContext();
	}
	
	/**
	 * �вι��캯��.
	 * @param normalColor
	 * @param borderColor
	 */
	public DefaultInputPanel(Color normalColor, Color borderColor) 
	{
		this.normalColor = normalColor;
		this.borderColor = borderColor;
		initialContext();
	}

	/**
	 * ����borderFlag.
	 * @param
	 *     borderFlag.
	 */
	public void setBorderFlag(boolean borderFlag) 
	{
		this.borderFlag = borderFlag;
	}

	/**
	 * ��ȡborderFlag.
	 * @return
	 *     borderFlag.
	 */
	public boolean isBorderFlag() 
	{
		return borderFlag;
	}
	
	/**
	 * ��ʼ������򣬿��Ա�����̳�.
	 */
	protected void initialContext() 
	{
		inputText.setBounds(7, 0, 153, 30);
		inputText.setOpaque(false);
		inputText.setBorder(null);
		DefaultInputMouseAdapter countListener = new DefaultInputMouseAdapter(this);
		inputText.addMouseListener(countListener);
		
		cancelBtn.setBounds(160, 0, 30, 30);
		cancelBtn.setBorder(null);
		cancelBtn.setBorderPainted(false);
		cancelBtn.setContentAreaFilled(false);
		cancelBtn.setFocusPainted(false);
		cancelBtn.addActionListener(new BaseAction());
		
		this.setLayout(null);
		this.add(inputText);
        this.add(cancelBtn);
	}

	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		// ������ɫ΢��.
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		// ��һ��������.
		g2.setColor(Color.white);
		g2.fillRoundRect(0, 0, 190, 30, 10, 10);
		
		// ��һ���ڲ����,���ڷ���JText.
		g2.fillRect(0, 0, 190, 17);
		
		// �߿�.
		BasicStroke basicStroke = new BasicStroke(1.0f);
		g2.setStroke(basicStroke);
		
		if(borderFlag) 
		{
			// Ϊ�þ�����ӱ߿���ɫ.
			g2.setColor(borderColor);
		}
		else 
		{
			g2.setColor(normalColor);
		}
		
		// Բ�Ǿ��ο�.
		g2.drawLine(0, 5, 0, 25);  
        g2.drawLine(189, 5, 189, 25);  
        g2.drawLine(5, 0, 185, 0);  
        g2.drawLine(5, 29, 185, 29);
        g2.drawArc(0, 0, 10, 10, 180, -90);
        g2.drawArc(179, 0, 10, 10, 90, -90);
        g2.drawArc(0, 18, 10, 10, 180, 90);
        g2.drawArc(179, 18, 10, 10, 270, 90);
	}
	
}
