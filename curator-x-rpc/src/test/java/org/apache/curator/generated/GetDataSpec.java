/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.curator.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetDataSpec implements org.apache.thrift.TBase<GetDataSpec, GetDataSpec._Fields>, java.io.Serializable, Cloneable, Comparable<GetDataSpec> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetDataSpec");

  private static final org.apache.thrift.protocol.TField PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("path", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField WATCHED_FIELD_DESC = new org.apache.thrift.protocol.TField("watched", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField ASYNC_CONTEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("asyncContext", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DECOMPRESSED_FIELD_DESC = new org.apache.thrift.protocol.TField("decompressed", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetDataSpecStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetDataSpecTupleSchemeFactory());
  }

  public String path; // required
  public boolean watched; // required
  public String asyncContext; // required
  public boolean decompressed; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PATH((short)1, "path"),
    WATCHED((short)2, "watched"),
    ASYNC_CONTEXT((short)3, "asyncContext"),
    DECOMPRESSED((short)4, "decompressed");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PATH
          return PATH;
        case 2: // WATCHED
          return WATCHED;
        case 3: // ASYNC_CONTEXT
          return ASYNC_CONTEXT;
        case 4: // DECOMPRESSED
          return DECOMPRESSED;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __WATCHED_ISSET_ID = 0;
  private static final int __DECOMPRESSED_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PATH, new org.apache.thrift.meta_data.FieldMetaData("path", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WATCHED, new org.apache.thrift.meta_data.FieldMetaData("watched", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ASYNC_CONTEXT, new org.apache.thrift.meta_data.FieldMetaData("asyncContext", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DECOMPRESSED, new org.apache.thrift.meta_data.FieldMetaData("decompressed", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetDataSpec.class, metaDataMap);
  }

  public GetDataSpec() {
  }

  public GetDataSpec(
    String path,
    boolean watched,
    String asyncContext,
    boolean decompressed)
  {
    this();
    this.path = path;
    this.watched = watched;
    setWatchedIsSet(true);
    this.asyncContext = asyncContext;
    this.decompressed = decompressed;
    setDecompressedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetDataSpec(GetDataSpec other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPath()) {
      this.path = other.path;
    }
    this.watched = other.watched;
    if (other.isSetAsyncContext()) {
      this.asyncContext = other.asyncContext;
    }
    this.decompressed = other.decompressed;
  }

  public GetDataSpec deepCopy() {
    return new GetDataSpec(this);
  }

  @Override
  public void clear() {
    this.path = null;
    setWatchedIsSet(false);
    this.watched = false;
    this.asyncContext = null;
    setDecompressedIsSet(false);
    this.decompressed = false;
  }

  public String getPath() {
    return this.path;
  }

  public GetDataSpec setPath(String path) {
    this.path = path;
    return this;
  }

  public void unsetPath() {
    this.path = null;
  }

  /** Returns true if field path is set (has been assigned a value) and false otherwise */
  public boolean isSetPath() {
    return this.path != null;
  }

  public void setPathIsSet(boolean value) {
    if (!value) {
      this.path = null;
    }
  }

  public boolean isWatched() {
    return this.watched;
  }

  public GetDataSpec setWatched(boolean watched) {
    this.watched = watched;
    setWatchedIsSet(true);
    return this;
  }

  public void unsetWatched() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WATCHED_ISSET_ID);
  }

  /** Returns true if field watched is set (has been assigned a value) and false otherwise */
  public boolean isSetWatched() {
    return EncodingUtils.testBit(__isset_bitfield, __WATCHED_ISSET_ID);
  }

  public void setWatchedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WATCHED_ISSET_ID, value);
  }

  public String getAsyncContext() {
    return this.asyncContext;
  }

  public GetDataSpec setAsyncContext(String asyncContext) {
    this.asyncContext = asyncContext;
    return this;
  }

  public void unsetAsyncContext() {
    this.asyncContext = null;
  }

  /** Returns true if field asyncContext is set (has been assigned a value) and false otherwise */
  public boolean isSetAsyncContext() {
    return this.asyncContext != null;
  }

  public void setAsyncContextIsSet(boolean value) {
    if (!value) {
      this.asyncContext = null;
    }
  }

  public boolean isDecompressed() {
    return this.decompressed;
  }

  public GetDataSpec setDecompressed(boolean decompressed) {
    this.decompressed = decompressed;
    setDecompressedIsSet(true);
    return this;
  }

  public void unsetDecompressed() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DECOMPRESSED_ISSET_ID);
  }

  /** Returns true if field decompressed is set (has been assigned a value) and false otherwise */
  public boolean isSetDecompressed() {
    return EncodingUtils.testBit(__isset_bitfield, __DECOMPRESSED_ISSET_ID);
  }

  public void setDecompressedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DECOMPRESSED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PATH:
      if (value == null) {
        unsetPath();
      } else {
        setPath((String)value);
      }
      break;

    case WATCHED:
      if (value == null) {
        unsetWatched();
      } else {
        setWatched((Boolean)value);
      }
      break;

    case ASYNC_CONTEXT:
      if (value == null) {
        unsetAsyncContext();
      } else {
        setAsyncContext((String)value);
      }
      break;

    case DECOMPRESSED:
      if (value == null) {
        unsetDecompressed();
      } else {
        setDecompressed((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PATH:
      return getPath();

    case WATCHED:
      return Boolean.valueOf(isWatched());

    case ASYNC_CONTEXT:
      return getAsyncContext();

    case DECOMPRESSED:
      return Boolean.valueOf(isDecompressed());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PATH:
      return isSetPath();
    case WATCHED:
      return isSetWatched();
    case ASYNC_CONTEXT:
      return isSetAsyncContext();
    case DECOMPRESSED:
      return isSetDecompressed();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetDataSpec)
      return this.equals((GetDataSpec)that);
    return false;
  }

  public boolean equals(GetDataSpec that) {
    if (that == null)
      return false;

    boolean this_present_path = true && this.isSetPath();
    boolean that_present_path = true && that.isSetPath();
    if (this_present_path || that_present_path) {
      if (!(this_present_path && that_present_path))
        return false;
      if (!this.path.equals(that.path))
        return false;
    }

    boolean this_present_watched = true;
    boolean that_present_watched = true;
    if (this_present_watched || that_present_watched) {
      if (!(this_present_watched && that_present_watched))
        return false;
      if (this.watched != that.watched)
        return false;
    }

    boolean this_present_asyncContext = true && this.isSetAsyncContext();
    boolean that_present_asyncContext = true && that.isSetAsyncContext();
    if (this_present_asyncContext || that_present_asyncContext) {
      if (!(this_present_asyncContext && that_present_asyncContext))
        return false;
      if (!this.asyncContext.equals(that.asyncContext))
        return false;
    }

    boolean this_present_decompressed = true;
    boolean that_present_decompressed = true;
    if (this_present_decompressed || that_present_decompressed) {
      if (!(this_present_decompressed && that_present_decompressed))
        return false;
      if (this.decompressed != that.decompressed)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(GetDataSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPath()).compareTo(other.isSetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.path, other.path);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWatched()).compareTo(other.isSetWatched());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWatched()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.watched, other.watched);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAsyncContext()).compareTo(other.isSetAsyncContext());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAsyncContext()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.asyncContext, other.asyncContext);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDecompressed()).compareTo(other.isSetDecompressed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDecompressed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.decompressed, other.decompressed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetDataSpec(");
    boolean first = true;

    sb.append("path:");
    if (this.path == null) {
      sb.append("null");
    } else {
      sb.append(this.path);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("watched:");
    sb.append(this.watched);
    first = false;
    if (!first) sb.append(", ");
    sb.append("asyncContext:");
    if (this.asyncContext == null) {
      sb.append("null");
    } else {
      sb.append(this.asyncContext);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("decompressed:");
    sb.append(this.decompressed);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetDataSpecStandardSchemeFactory implements SchemeFactory {
    public GetDataSpecStandardScheme getScheme() {
      return new GetDataSpecStandardScheme();
    }
  }

  private static class GetDataSpecStandardScheme extends StandardScheme<GetDataSpec> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetDataSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.path = iprot.readString();
              struct.setPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WATCHED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.watched = iprot.readBool();
              struct.setWatchedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ASYNC_CONTEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.asyncContext = iprot.readString();
              struct.setAsyncContextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DECOMPRESSED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.decompressed = iprot.readBool();
              struct.setDecompressedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetDataSpec struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.path != null) {
        oprot.writeFieldBegin(PATH_FIELD_DESC);
        oprot.writeString(struct.path);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(WATCHED_FIELD_DESC);
      oprot.writeBool(struct.watched);
      oprot.writeFieldEnd();
      if (struct.asyncContext != null) {
        oprot.writeFieldBegin(ASYNC_CONTEXT_FIELD_DESC);
        oprot.writeString(struct.asyncContext);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DECOMPRESSED_FIELD_DESC);
      oprot.writeBool(struct.decompressed);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetDataSpecTupleSchemeFactory implements SchemeFactory {
    public GetDataSpecTupleScheme getScheme() {
      return new GetDataSpecTupleScheme();
    }
  }

  private static class GetDataSpecTupleScheme extends TupleScheme<GetDataSpec> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetDataSpec struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPath()) {
        optionals.set(0);
      }
      if (struct.isSetWatched()) {
        optionals.set(1);
      }
      if (struct.isSetAsyncContext()) {
        optionals.set(2);
      }
      if (struct.isSetDecompressed()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetPath()) {
        oprot.writeString(struct.path);
      }
      if (struct.isSetWatched()) {
        oprot.writeBool(struct.watched);
      }
      if (struct.isSetAsyncContext()) {
        oprot.writeString(struct.asyncContext);
      }
      if (struct.isSetDecompressed()) {
        oprot.writeBool(struct.decompressed);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetDataSpec struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.path = iprot.readString();
        struct.setPathIsSet(true);
      }
      if (incoming.get(1)) {
        struct.watched = iprot.readBool();
        struct.setWatchedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.asyncContext = iprot.readString();
        struct.setAsyncContextIsSet(true);
      }
      if (incoming.get(3)) {
        struct.decompressed = iprot.readBool();
        struct.setDecompressedIsSet(true);
      }
    }
  }

}

