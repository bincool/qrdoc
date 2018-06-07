/**
* @FileName: DefaultInputMouseAdapter.java
* @Package: com.hro.qrdoc.action.listener
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: DefaultInputMouseAdapter.java: �����panel������.
* @Author wchy����������(891946049).
* @Date 2018��6��6�� ����4:42:46.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.action.listener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.hro.qrdoc.ui.panel.base.DefaultInputPanel;

/**
* @ClassName: DefaultInputMouseAdapter.java
* 
* @Description: 
* <p>
* �����pannel������.
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
* @Date: 2018��6��6�� ����4:42:46.
* 
*/
public class DefaultInputMouseAdapter extends MouseAdapter 
{
	
	/**
	 * �����panel.
	 */
	private DefaultInputPanel inputPanel;
	
	/**
	 * �вι��캯��.
	 * @param inputPanel
	 */
	public DefaultInputMouseAdapter(DefaultInputPanel inputPanel) 
	{
		this.inputPanel = inputPanel;
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseAdapter#mouseEntered(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseEntered(MouseEvent e) 
	{
		inputPanel.setBorderFlag(true);
		inputPanel.updateUI();
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseExited(MouseEvent e) 
	{
		inputPanel.setBorderFlag(false);
		inputPanel.updateUI();
	}
	
}
