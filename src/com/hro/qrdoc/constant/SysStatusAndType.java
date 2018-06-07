/**
* @FileName: SysStatusAndType.java
* @Package: com.hro.qrdoc.constant
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: SysStatusAndType.java: ϵͳ״̬������.
* @Author wchy����������(891946049).
* @Date 2018��6��7�� ����5:45:08.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.constant;

/**
* @ClassName: SysStatusAndType.java
* 
* @Description: 
* <p>
* ϵͳ״̬������.
* </p>
* <p>
* ��ϸ������ϵͳ״̬�����ͳ����������廯.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��6��7�� ����5:45:08.
* 
*/
public interface SysStatusAndType 
{
	
	/**
	 * ��ά��װ��ҳ��beanУ����.
	 */
	interface qrBoxPageParamsVerify 
	{
		/**
		 * ÿ���������.
		 */
		String ERR_COUNT = "qrboxpage.params.verify.err.count";
		
		/**
		 * ������Ŵ���.
		 */
		String ERR_ORDERNUM = "qrboxpage.params.verify.err.ordernum";
		
		/**
		 * �����������.
		 */
		String ERR_BIGBOXCODE = "qrboxpage.params.verify.err.bigboxcode";
		
		/**
		 * װ���ά�����.
		 */
		String ERR_QRCODETEXT = "qrboxpage.params.verify.err.qrcodetext";
		
		/**
		 * У��ͨ��.
		 */
		String OK = "qrboxpage.params.verify.ok";
	}
	
}
