/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.scribe_log4j.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import com.facebook.thrift.*;

import com.facebook.thrift.protocol.*;
import com.facebook.thrift.transport.*;

public class LogEntry implements TBase, java.io.Serializable {
  public String category;
  public static final int CATEGORY = 1;
  public String message;
  public static final int MESSAGE = 2;

  public final Isset __isset = new Isset();
  public static final class Isset implements java.io.Serializable {
    public boolean category = false;
    public boolean message = false;
  }

  public LogEntry() {
  }

  public LogEntry(
    String category,
    String message)
  {
    this();
    this.category = category;
    this.__isset.category = (category != null);
    this.message = message;
    this.__isset.message = (message != null);
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LogEntry)
      return this.equals((LogEntry)that);
    return false;
  }

  public boolean equals(LogEntry that) {
    if (that == null)
      return false;

    boolean this_present_category = true && (this.category != null);
    boolean that_present_category = true && (that.category != null);
    if (this_present_category || that_present_category) {
      if (!(this_present_category && that_present_category))
        return false;
      if (!this.category.equals(that.category))
        return false;
    }

    boolean this_present_message = true && (this.message != null);
    boolean that_present_message = true && (that.message != null);
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id)
      {
        case CATEGORY:
          if (field.type == TType.STRING) {
            this.category = iprot.readString();
            this.__isset.category = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MESSAGE:
          if (field.type == TType.STRING) {
            this.message = iprot.readString();
            this.__isset.message = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
  }

  public void write(TProtocol oprot) throws TException {
    TStruct struct = new TStruct("LogEntry");
    oprot.writeStructBegin(struct);
    TField field = new TField();
    if (this.category != null) {
      field.name = "category";
      field.type = TType.STRING;
      field.id = CATEGORY;
      oprot.writeFieldBegin(field);
      oprot.writeString(this.category);
      oprot.writeFieldEnd();
    }
    if (this.message != null) {
      field.name = "message";
      field.type = TType.STRING;
      field.id = MESSAGE;
      oprot.writeFieldBegin(field);
      oprot.writeString(this.message);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("LogEntry(");
    boolean first = true;

    if (!first) sb.append(", ");
    sb.append("category:");
    sb.append(this.category);
    first = false;
    if (!first) sb.append(", ");
    sb.append("message:");
    sb.append(this.message);
    first = false;
    sb.append(")");
    return sb.toString();
  }

}
