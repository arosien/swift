/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package mt.swift;

import com.facebook.thrift.*;

import com.facebook.thrift.protocol.*;

public class TNested implements TBase, java.io.Serializable {
  public String value;
  public static final int VALUE = 1;

  public final Isset __isset = new Isset();
  public static final class Isset implements java.io.Serializable {
    public boolean value = false;
  }

  public TNested() {
  }

  public TNested(
    String value)
  {
    this();
    this.value = value;
    this.__isset.value = (value != null);
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TNested)
      return this.equals((TNested)that);
    return false;
  }

  public boolean equals(TNested that) {
    if (that == null)
      return false;

    boolean this_present_value = true && (this.value != null);
    boolean that_present_value = true && (that.value != null);
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
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
        case VALUE:
          if (field.type == TType.STRING) {
            this.value = iprot.readString();
            this.__isset.value = true;
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
    TStruct struct = new TStruct("TNested");
    oprot.writeStructBegin(struct);
    TField field = new TField();
    if (this.value != null) {
      field.name = "value";
      field.type = TType.STRING;
      field.id = VALUE;
      oprot.writeFieldBegin(field);
      oprot.writeString(this.value);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder("TNested(");
    boolean first = true;

    if (!first) sb.append(", ");
    sb.append("value:");
    sb.append(this.value);
    first = false;
    sb.append(")");
    return sb.toString();
  }

}

