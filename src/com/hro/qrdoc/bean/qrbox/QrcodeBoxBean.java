/**
* @FileName: QrcodeBoxBean.java
* @Package: com.hro.qrdoc.bean.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: QrcodeBoxBean.java: ��ά��װ��bean.
* @Author wchy����������(891946049).
* @Date 2018��6��7�� ����3:07:24.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.bean.qrbox;

import java.io.Serializable;

/**
* @ClassName: QrcodeBoxBean.java
* 
* @Description: 
* <p>
* ��ά��װ��bean.
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
* @Date: 2018��6��7�� ����3:07:24.
* 
*/
public class QrcodeBoxBean implements Serializable 
{
	
	/**
	 * ���а汾��.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ʵ��ID.
	 */
	private String id;
	
	/**
	 * ÿ�����.
	 */
	private int count;
	
	/**
	 * �������.
	 */
	private String orderNum;
	
	/**
	 * ��������.
	 */
	private String bigBoxCode;
	
	/**
	 * װ���ά��.
	 */
	private String qrCodeText;

	/**
	 * ��ȡid.
	 * @return
	 *     id.
	 */
	public String getId() 
	{
		return id;
	}

	/**
	 * ����id.
	 * @param
	 *     id.
	 */
	public void setId(String id) 
	{
		this.id = id;
	}

	/**
	 * ��ȡcount.
	 * @return
	 *     count.
	 */
	public int getCount() 
	{
		return count;
	}

	/**
	 * ����count.
	 * @param
	 *     count.
	 */
	public void setCount(int count) 
	{
		this.count = count;
	}

	/**
	 * ��ȡorderNum.
	 * @return
	 *     orderNum.
	 */
	public String getOrderNum() 
	{
		return orderNum;
	}

	/**
	 * ����orderNum.
	 * @param
	 *     orderNum.
	 */
	public void setOrderNum(String orderNum) 
	{
		this.orderNum = orderNum;
	}

	/**
	 * ��ȡbigBoxCode.
	 * @return
	 *     bigBoxCode.
	 */
	public String getBigBoxCode() 
	{
		return bigBoxCode;
	}

	/**
	 * ����bigBoxCode.
	 * @param
	 *     bigBoxCode.
	 */
	public void setBigBoxCode(String bigBoxCode) 
	{
		this.bigBoxCode = bigBoxCode;
	}

	/**
	 * ��ȡqrCodeText.
	 * @return
	 *     qrCodeText.
	 */
	public String getQrCodeText() 
	{
		return qrCodeText;
	}

	/**
	 * ����qrCodeText.
	 * @param
	 *     qrCodeText.
	 */
	public void setQrCodeText(String qrCodeText) 
	{
		this.qrCodeText = qrCodeText;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return "QrcodeBoxBean [id=" + id + ", count=" + count + ", orderNum=" + orderNum + ", bigBoxCode=" + bigBoxCode
				+ ", qrCodeText=" + qrCodeText + "]";
	}
	
}
