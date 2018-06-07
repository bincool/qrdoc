/**
* @FileName: DefaultInputMouseAdapter.java
* @Package: com.hro.qrdoc.action.listener
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: DefaultInputMouseAdapter.java: 输入框panel鼠标监听.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月6日 下午4:42:46.
* @Content: 新增.
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
* 输入框pannel鼠标监听.
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
* @Date: 2018年6月6日 下午4:42:46.
* 
*/
public class DefaultInputMouseAdapter extends MouseAdapter 
{
	
	/**
	 * 输入框panel.
	 */
	private DefaultInputPanel inputPanel;
	
	/**
	 * 有参构造函数.
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
