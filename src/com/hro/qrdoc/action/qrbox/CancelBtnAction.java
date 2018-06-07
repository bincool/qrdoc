/**
* @FileName: CancelBtnAction.java
* @Package: com.hro.qrdoc.action.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: CancelBtnAction.java: ȡ�����ð�ť�¼�.
* @Author wchy����������(891946049).
* @Date 2018��6��7�� ����2:40:22.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.action.qrbox;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import org.apache.log4j.Logger;

import com.hro.qrdoc.action.base.BaseAction;

/**
* @ClassName: CancelBtnAction.java
* 
* @Description: 
* <p>
* ȡ�����ð�ť�¼�.
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
* @Date: 2018��6��7�� ����2:40:22.
* 
*/
public class CancelBtnAction extends BaseAction 
{
	
	/**
	 * ��־����.
	 */
	private static final Logger LOGGER = Logger.getLogger(CancelBtnAction.class);
	
	/**
	 * �ı������.
	 */
	private JTextField inputText;
	
	/**
	 * �в������캯��.
	 * @param inputText
	 * 		��ȡ�����õ�inputText��.
	 */
	public CancelBtnAction(JTextField inputText) 
	{
		this.inputText = inputText;
	}

	/* (non-Javadoc)
	 * @see com.hro.qrdoc.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		LOGGER.info("Input box contents reset, the data is : " + inputText.getText());
		inputText.setText("");
	}
	
}
