/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */
         
// MESSAGE GPS_STATUS PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Parser;
import com.MAVLink.ardupilotmega.CRC;
import java.nio.ByteBuffer;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
* The positioning status, as reported by GPS. This message is intended to display status information about each satellite visible to the receiver. See message GLOBAL_POSITION for the global position estimate. This message can contain information for up to 20 satellites.
*/
public class msg_gps_status_test{

public static final int MAVLINK_MSG_ID_GPS_STATUS = 25;
public static final int MAVLINK_MSG_LENGTH = 101;
private static final long serialVersionUID = MAVLINK_MSG_ID_GPS_STATUS;

private Parser parser = new Parser();

public CRC generateCRC(byte[] packet){
    CRC crc = new CRC();
    for (int i = 1; i < packet.length - 2; i++) {
        crc.update_checksum(packet[i] & 0xFF);
    }
    crc.finish_checksum(MAVLINK_MSG_ID_GPS_STATUS);
    return crc;
}

public byte[] generateTestPacket(){
    ByteBuffer payload = ByteBuffer.allocate(6 + MAVLINK_MSG_LENGTH + 2);
    payload.put((byte)MAVLinkPacket.MAVLINK_STX); //stx
    payload.put((byte)MAVLINK_MSG_LENGTH); //len
    payload.put((byte)0); //seq
    payload.put((byte)255); //sysid
    payload.put((byte)190); //comp id
    payload.put((byte)MAVLINK_MSG_ID_GPS_STATUS); //msg id
    payload.put((byte)5); //satellites_visible
    //satellite_prn
    payload.put((byte)72);
    payload.put((byte)73);
    payload.put((byte)74);
    payload.put((byte)75);
    payload.put((byte)76);
    payload.put((byte)77);
    payload.put((byte)78);
    payload.put((byte)79);
    payload.put((byte)80);
    payload.put((byte)81);
    payload.put((byte)82);
    payload.put((byte)83);
    payload.put((byte)84);
    payload.put((byte)85);
    payload.put((byte)86);
    payload.put((byte)87);
    payload.put((byte)88);
    payload.put((byte)89);
    payload.put((byte)90);
    payload.put((byte)91);
    //satellite_used
    payload.put((byte)132);
    payload.put((byte)133);
    payload.put((byte)134);
    payload.put((byte)135);
    payload.put((byte)136);
    payload.put((byte)137);
    payload.put((byte)138);
    payload.put((byte)139);
    payload.put((byte)140);
    payload.put((byte)141);
    payload.put((byte)142);
    payload.put((byte)143);
    payload.put((byte)144);
    payload.put((byte)145);
    payload.put((byte)146);
    payload.put((byte)147);
    payload.put((byte)148);
    payload.put((byte)149);
    payload.put((byte)150);
    payload.put((byte)151);
    //satellite_elevation
    payload.put((byte)192);
    payload.put((byte)193);
    payload.put((byte)194);
    payload.put((byte)195);
    payload.put((byte)196);
    payload.put((byte)197);
    payload.put((byte)198);
    payload.put((byte)199);
    payload.put((byte)200);
    payload.put((byte)201);
    payload.put((byte)202);
    payload.put((byte)203);
    payload.put((byte)204);
    payload.put((byte)205);
    payload.put((byte)206);
    payload.put((byte)207);
    payload.put((byte)208);
    payload.put((byte)209);
    payload.put((byte)210);
    payload.put((byte)211);
    //satellite_azimuth
    payload.put((byte)252);
    payload.put((byte)253);
    payload.put((byte)254);
    payload.put((byte)255);
    payload.put((byte)0);
    payload.put((byte)1);
    payload.put((byte)2);
    payload.put((byte)3);
    payload.put((byte)4);
    payload.put((byte)5);
    payload.put((byte)6);
    payload.put((byte)7);
    payload.put((byte)8);
    payload.put((byte)9);
    payload.put((byte)10);
    payload.put((byte)11);
    payload.put((byte)12);
    payload.put((byte)13);
    payload.put((byte)14);
    payload.put((byte)15);
    //satellite_snr
    payload.put((byte)56);
    payload.put((byte)57);
    payload.put((byte)58);
    payload.put((byte)59);
    payload.put((byte)60);
    payload.put((byte)61);
    payload.put((byte)62);
    payload.put((byte)63);
    payload.put((byte)64);
    payload.put((byte)65);
    payload.put((byte)66);
    payload.put((byte)67);
    payload.put((byte)68);
    payload.put((byte)69);
    payload.put((byte)70);
    payload.put((byte)71);
    payload.put((byte)72);
    payload.put((byte)73);
    payload.put((byte)74);
    payload.put((byte)75);
    
    CRC crc = generateCRC(payload.array());
    payload.put((byte)crc.getLSB());
    payload.put((byte)crc.getMSB());
    return payload.array();
}

@Test
public void test(){
    byte[] packet = generateTestPacket();
    for(int i = 0; i < packet.length - 1; i++){
        parser.mavlink_parse_char(packet[i] & 0xFF);
    }
    MAVLinkPacket m = parser.mavlink_parse_char(packet[packet.length - 1] & 0xFF);
    byte[] processedPacket = m.encodePacket();
    assertArrayEquals("msg_gps_status", processedPacket, packet);
}
}
        