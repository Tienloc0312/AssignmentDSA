/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueMessage;
import java.util.Date;
/**
 *
 * @author hp
 */
public class Message {
    String person;
    String data;
    private Date Time;
    public Message() {
        this.data = "";
    }   
    public Message(String data) {
        this.data = data;
    }
    public Message(String person, String data, Date Tỉme) {
        this.person = person;
        this.data = data;
        this.Time = Time;
    }
    public String getData() {
        return this.data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getPerson() {
        return this.person;
    }
    public void setPerson(String person) {
        this.person = person;
    }
    public Date getTime(){
        return Time;
    }
    public void setTime(Date Time) {
        this.Time = Time;
    }
   
}
