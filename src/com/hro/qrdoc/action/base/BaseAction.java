/**
* @FileName: BaseAction.java
* @Package: com.hro.qrdoc.action.base
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: BaseAction.java: �����¼�.
* @Author wchy����������(891946049).
* @Date 2018��6��7�� ����12:56:36.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.action.base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import com.hro.qrdoc.constant.ApplicationConstant;

/**
* @ClassName: BaseAction.java
* 
* @Description: 
* <p>
* �����¼�.
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
* @Date: 2018��6��7�� ����12:56:36.
* 
*/
public class BaseAction implements ActionListener 
{
	
	/**
	 * ��־����.
	 */
	protected static final Logger LOGGER = Logger.getLogger(BaseAction.class);

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane.showMessageDialog(null, ApplicationConstant.WARN_ACTION_FUN_NOTOPEN, ApplicationConstant.FRAME_TITLE, JOptionPane.WARNING_MESSAGE);
	}

}
