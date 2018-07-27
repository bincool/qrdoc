/**
* @FileName: CountInputListener.java
* @Package: com.hro.qrdoc.action.listener
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: CountInputListener.java: ÿ������ı�������.
* @Author wchy����������(891946049).
* @Date 2018��7��26�� ����4:42:46.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.action.listener;

import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.hro.qrdoc.ui.panel.base.DefaultInputPanel;

import io.github.bincool.utils.commons.StringUtils;

/**
* @ClassName: CountInputListener.java
* 
* @Description: 
* <p>
* ÿ������ı�������.
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
* @Date: 2018��7��26�� ����4:42:46.
* 
*/
public class CountInputListener implements DocumentListener 
{
	
	/**
	 * ÿ��������.
	 */
	private DefaultInputPanel countPanel;
	
	/**
	 * ��ά�������ı���.
	 */
	private JTextArea qrCodeText;
	
	/**
	 * ���캯��.
	 * @param countPanel
	 * @param qrCodeText
	 */
	public CountInputListener(DefaultInputPanel countPanel, JTextArea qrCodeText) 
	{
		this.countPanel = countPanel;
		this.qrCodeText = qrCodeText;
	}

	@Override
    public void insertUpdate(DocumentEvent e) 
	{
		setQrCodeTextEnabled();
    }

    @Override
    public void removeUpdate(DocumentEvent e) 
    {
    	setQrCodeTextEnabled();
    }

    @Override
    public void changedUpdate(DocumentEvent e) 
    {
    	setQrCodeTextEnabled();
    }
    
    /**
     * ����qrCodeText��enabled����.
     */
    private void setQrCodeTextEnabled() 
    {
    	if (StringUtils.isNotEmpty(countPanel.getInputValue())) 
		{
			qrCodeText.setEnabled(true);
		} 
		else 
		{
			qrCodeText.setEnabled(false);
		}
    }

}
