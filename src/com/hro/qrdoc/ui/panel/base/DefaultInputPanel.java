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
	 * �����߿���ɫ.
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
	 * �����Ĭ�Ͽ�.
	 */
	private int width = 153;
	
	/**
	 * �����Ĭ�ϸ�.
	 */
	private int height = 17;
	
	/**
	 * ȡ����ť.
	 */
	private JButton cancelBtn = new JButton(new ImageIcon(Toolkit.getDefaultToolkit().getImage(ApplicationConstant.FRAME_CANCEL_HIDE_PATH)));
	
	/**
	 * �޲ι��캯��.
	 */
	public DefaultInputPanel() 
	{
		initLayout();
		initAction();
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
		initLayout();
		initAction();
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
	 * ��ʼ������򲼾֣����Ա�����̳�.
	 */
	protected void initLayout() 
	{
		this.setLayout(null);
		
		// ����򲼾�.
		inputText.setBounds(7, 0, width, 13 + height);
		inputText.setOpaque(false);
		inputText.setBorder(null);
		this.add(inputText);
		
		// ȡ�����ð�ť����.
		cancelBtn.setBounds(7 + width, 0, 30, 13 + height);
		cancelBtn.setBorder(null);
		cancelBtn.setBorderPainted(false);
		cancelBtn.setContentAreaFilled(false);
		cancelBtn.setFocusPainted(false);
        this.add(cancelBtn);
	}
	
	/**
	 * ��ʼ��������¼������Ա�����̳�.
	 */
	protected void initAction() 
	{
		// ���������¼�.
		DefaultInputMouseAdapter countListener = new DefaultInputMouseAdapter(this);
		inputText.addMouseListener(countListener);
		
		// ȡ�����ð�ť�¼�.
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
		
		// ������ɫ΢��.
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		// ��һ��������.
		g2.setColor(Color.white);
		g2.fillRoundRect(0, 0, 37 + width, 13 + height, 10, 10);
		
		// ��һ���ڲ����,���ڷ���JText.
		g2.fillRect(0, 0, 37 + width, height);
		
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
