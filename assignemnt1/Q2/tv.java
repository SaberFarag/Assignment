/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1;

/**
 *
 * @author saber farag
 */
import java.util.*;
public class tv {
    int increaseChannel=0;
    int increaseVolume=0;
    int cnt=0;
    int cntt=0;
    
    int currentChannel=20;
    int currentVolume=7;
     Vector<Integer> array = new Vector<>(currentChannel+cnt); 
     Vector<Integer> volume = new Vector<>(currentVolume+cntt); 
    boolean trunon;
    // default constructor 
  public  tv(){}
public void trunOn()
{
    this.trunon=true;
    System.out.println("Tv is trunOn");
}
public void trunOff()
{
    this.trunon=false;
    System.out.println("Tv is trunOff");
} 
void setChannel()
{
   // add channel
   array.add(cnt++);
    System.out.println("setChannel : "+cnt);
}

void setVolume()
{
    // add Volume
   volume.add(cntt++);
   System.out.println("setVolume : "+cntt);
}

void channelUp()
{
    // this condition controller increaseChannel in array
    if(increaseChannel>=0&&increaseChannel<=currentChannel+cnt){
   increaseChannel++; 
   System.out.println("channelUp : "+increaseChannel);
    }
}
void channelDown()
{
      // this condition controller increaseChannel in array
    if(increaseChannel>=0&&increaseChannel<=currentChannel+cnt){
   increaseChannel--; 
   System.out.println("channelDown : "+increaseChannel);
}}
void volumeUp()
{
    // this condition controller increaseVolume in array
    if(increaseVolume>=0&&increaseVolume<=currentVolume+cnt){
   increaseVolume++; 
   System.out.println("volumeUp : "+increaseVolume);
}
}
void volumeDown()
{
    // this condition controller increaseVolume in array
    if(increaseVolume>=0&&increaseVolume<=currentVolume+cnt){
   increaseVolume--; 
      System.out.println("volumeDown : "+increaseVolume);

}
}
}
