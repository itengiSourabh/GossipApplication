package com.Kratos.gossipapplication.Models;


public class MessageModel {
    String uId, message, messageId;
    Long timestamp;

    public MessageModel(String uId, String message, Long timestamp) {
        this.uId = uId;
        this.message = message;
        this.timestamp = timestamp;
    }

    public MessageModel(String uId, String message) {
        this.uId = uId;
        this.message = message;
    }
    public MessageModel(){}

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public  Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }




        private static final int SECONDMILLIS =1000;
        private static final int MINUTE_MILLIS =60 * SECONDMILLIS;
        private static final int HOURMILLIS = 60 * MINUTE_MILLIS;
        private static final int DAY_MILLIS = 24 * HOURMILLIS;

        public  String LastSeenTimeConvert(long time){

            if(time < 1000000000L){
                time = 1000;
            }
            long now = System.currentTimeMillis();

            if (time > now || time <= 0){
                return "just now";
            }

            final long diff = now - time;
            if (diff<MINUTE_MILLIS){
                return "just now";
            }else if (diff<2*MINUTE_MILLIS){
                return "1 minute ago";
            }else if (diff<50*MINUTE_MILLIS){
                return (diff/MINUTE_MILLIS)+" minutes ago";
            }else if (diff<90*MINUTE_MILLIS){
                return "1 hour ago";
            }else if (diff<24*HOURMILLIS){
                return (diff/HOURMILLIS) +" hours ago";
            }else if (diff<48*HOURMILLIS){
                return "yesterday";
            }else{
                return diff/DAY_MILLIS+" days ago";
            }

        }



}
