/**
* @FileName: CancelBtnMouseAdapter.java
* @Package: com.hro.qrdoc.action.listener
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: CancelBtnMouseAdapter.java: ȡ�����ð�ť����¼�.
* @Author wchy����������(891946049).
* @Date 2018��6��7�� ����2:42:16.
* @Content: ����.
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
* ȡ�����ð�ť����¼�.
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
* @Date: 2018��6��7�� ����2:42:16.
* 
*/
public class CancelBtnMouseAdapter extends MouseAdapter 
{
	
	/**
	 * �����panel.
	 */
	private JButton cancelBtn;
	
	/**
	 * Ĭ��ͼ��.
	 */
	private ImageIcon defaultIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(ApplicationConstant.FRAME_CANCEL_HIDE_PATH));
	
	/**
	 * ȡ��ͼ��.
	 */
	private ImageIcon cacelIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(ApplicationConstant.FRAME_CANCEL_SHOW_PATH));
	
	/**
	 * �вι��캯��.
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
