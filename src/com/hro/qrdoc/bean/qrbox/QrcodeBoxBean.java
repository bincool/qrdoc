/**
* @FileName: QrcodeBoxBean.java
* @Package: com.hro.qrdoc.bean.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: QrcodeBoxBean.java: 二维码装箱bean.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月7日 下午3:07:24.
* @Content: 新增.
* @Version: V1.0.
*/
package com.hro.qrdoc.bean.qrbox;

import java.io.Serializable;

/**
* @ClassName: QrcodeBoxBean.java
* 
* @Description: 
* <p>
* 二维码装箱bean.
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
* @Date: 2018年6月7日 下午3:07:24.
* 
*/
public class QrcodeBoxBean implements Serializable 
{
	
	/**
	 * 序列版本号.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 实体ID.
	 */
	private String id;
	
	/**
	 * 每箱个数.
	 */
	private String count;
	
	/**
	 * 订单编号.
	 */
	private String orderNum;
	
	/**
	 * 大箱条码.
	 */
	private String bigBoxCode;
	
	/**
	 * 装箱二维码.
	 */
	private String qrCodeText;

	/**
	 * 获取id.
	 * @return
	 *     id.
	 */
	public String getId() 
	{
		return id;
	}

	/**
	 * 设置id.
	 * @param
	 *     id.
	 */
	public void setId(String id) 
	{
		this.id = id;
	}

	/**
	 * 获取count.
	 * @return
	 *     count.
	 */
	public String getCount() 
	{
		return count;
	}

	/**
	 * 设置count.
	 * @param
	 *     count.
	 */
	public void setCount(String count) 
	{
		this.count = count;
	}

	/**
	 * 获取orderNum.
	 * @return
	 *     orderNum.
	 */
	public String getOrderNum() 
	{
		return orderNum;
	}

	/**
	 * 设置orderNum.
	 * @param
	 *     orderNum.
	 */
	public void setOrderNum(String orderNum) 
	{
		this.orderNum = orderNum;
	}

	/**
	 * 获取bigBoxCode.
	 * @return
	 *     bigBoxCode.
	 */
	public String getBigBoxCode() 
	{
		return bigBoxCode;
	}

	/**
	 * 设置bigBoxCode.
	 * @param
	 *     bigBoxCode.
	 */
	public void setBigBoxCode(String bigBoxCode) 
	{
		this.bigBoxCode = bigBoxCode;
	}

	/**
	 * 获取qrCodeText.
	 * @return
	 *     qrCodeText.
	 */
	public String getQrCodeText() 
	{
		return qrCodeText;
	}

	/**
	 * 设置qrCodeText.
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
