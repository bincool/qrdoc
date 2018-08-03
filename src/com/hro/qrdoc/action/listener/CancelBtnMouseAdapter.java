/**
* @FileName: CancelBtnMouseAdapter.java
* @Package: com.hro.qrdoc.action.listener
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: CancelBtnMouseAdapter.java: 取消重置按钮鼠标事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月7日 下午2:42:16.
* @Content: 新增.
* @Version: V1.0.
*/
package com.hro.qrdoc.action.listener;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import com.hro.qrdoc.constant.ApplicationConstant;

/**
* @ClassName: CancelBtnMouseAdapter.java
* 
* @Description: 
* <p>
* 取消重置按钮鼠标事件.
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
* @Date: 2018年6月7日 下午2:42:16.
* 
*/
public class CancelBtnMouseAdapter extends MouseAdapter 
{
	
	/**
	 * 输入框panel.
	 */
	private JButton cancelBtn;
	
	/**
	 * 默认图标.
	 */
	private ImageIcon defaultIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(ApplicationConstant.FRAME_CANCEL_HIDE_PATH));
	
	/**
	 * 取消图标.
	 */
	private ImageIcon cacelIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(ApplicationConstant.FRAME_CANCEL_SHOW_PATH));
	
	/**
	 * 有参构造函数.
	 * @param cancelBtn
	 */
	public CancelBtnMouseAdapter(JButton cancelBtn) 
	{
		this.cancelBtn = cancelBtn;
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseAdapter#mouseEntered(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseEntered(MouseEvent e) 
	{
		cancelBtn.setIcon(cacelIcon);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseExited(MouseEvent e) 
	{
		cancelBtn.setIcon(defaultIcon);
	}
	
}
