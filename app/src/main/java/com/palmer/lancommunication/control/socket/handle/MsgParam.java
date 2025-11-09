package com.palmer.lancommunication.control.socket.handle;


import com.palmer.lancommunication.control.socket.data.MsgEntity;

public class MsgParam {
	
	private MsgEntity mMsgEntity;
	
	public void setMsgEntity(MsgEntity entity){
		this.mMsgEntity = entity;
	}
	
	public MsgEntity getMsgEntity(){
		return mMsgEntity;
	}

}
