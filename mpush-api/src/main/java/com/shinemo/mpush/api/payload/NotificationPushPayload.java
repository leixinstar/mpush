package com.shinemo.mpush.api.payload;


/**
 * msgId、msgType 必填 
 * msgType=1 :nofication,提醒。
 *            必填:title，content。没有title，则为应用名称。 
 *            非必填。nid 通知id,主要用于聚合通知。
 * 			  content 为push  message。附加的一些业务属性，都在里边。json格式
 * msgType=2 :非通知消息。不在通知栏展示。
 *            必填：content。
 * msgType=3 :消息+提醒
 *            作为一个push消息过去。和jpush不一样。jpush的消息和提醒是分开发送的。
 *        
 *
 */
public class NotificationPushPayload extends BasePayload<NotificationPushPayload> implements Payload{
    
	private static final long serialVersionUID = 4363667286689742483L;
	private String title;
	private String content;
	public String getTitle() {
		return title;
	}
	public NotificationPushPayload setTitle(String title) {
		this.title = title;
		return this;
	}
	public String getContent() {
		return content;
	}
	public NotificationPushPayload setContent(String content) {
		this.content = content;
		return this;
	}
	
	
	
}
