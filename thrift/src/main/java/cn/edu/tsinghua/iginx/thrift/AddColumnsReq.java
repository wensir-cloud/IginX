/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.edu.tsinghua.iginx.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2021-03-01")
public class AddColumnsReq implements org.apache.thrift.TBase<AddColumnsReq, AddColumnsReq._Fields>, java.io.Serializable, Cloneable, Comparable<AddColumnsReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AddColumnsReq");

  private static final org.apache.thrift.protocol.TField SESSION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField PATHS_FIELD_DESC = new org.apache.thrift.protocol.TField("paths", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField ATTRIBUTES_FIELD_DESC = new org.apache.thrift.protocol.TField("attributes", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AddColumnsReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AddColumnsReqTupleSchemeFactory();

  public long sessionId; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> paths; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<java.util.Map<java.lang.String,java.nio.ByteBuffer>> attributes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SESSION_ID((short)1, "sessionId"),
    PATHS((short)2, "paths"),
    ATTRIBUTES((short)3, "attributes");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SESSION_ID
          return SESSION_ID;
        case 2: // PATHS
          return PATHS;
        case 3: // ATTRIBUTES
          return ATTRIBUTES;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SESSIONID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ATTRIBUTES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SESSION_ID, new org.apache.thrift.meta_data.FieldMetaData("sessionId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PATHS, new org.apache.thrift.meta_data.FieldMetaData("paths", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.ATTRIBUTES, new org.apache.thrift.meta_data.FieldMetaData("attributes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING                , true)))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AddColumnsReq.class, metaDataMap);
  }

  public AddColumnsReq() {
  }

  public AddColumnsReq(
    long sessionId,
    java.util.List<java.lang.String> paths)
  {
    this();
    this.sessionId = sessionId;
    setSessionIdIsSet(true);
    this.paths = paths;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddColumnsReq(AddColumnsReq other) {
    __isset_bitfield = other.__isset_bitfield;
    this.sessionId = other.sessionId;
    if (other.isSetPaths()) {
      java.util.List<java.lang.String> __this__paths = new java.util.ArrayList<java.lang.String>(other.paths);
      this.paths = __this__paths;
    }
    if (other.isSetAttributes()) {
      java.util.List<java.util.Map<java.lang.String,java.nio.ByteBuffer>> __this__attributes = new java.util.ArrayList<java.util.Map<java.lang.String,java.nio.ByteBuffer>>(other.attributes.size());
      for (java.util.Map<java.lang.String,java.nio.ByteBuffer> other_element : other.attributes) {
        java.util.Map<java.lang.String,java.nio.ByteBuffer> __this__attributes_copy = new java.util.HashMap<java.lang.String,java.nio.ByteBuffer>(other_element);
        __this__attributes.add(__this__attributes_copy);
      }
      this.attributes = __this__attributes;
    }
  }

  public AddColumnsReq deepCopy() {
    return new AddColumnsReq(this);
  }

  @Override
  public void clear() {
    setSessionIdIsSet(false);
    this.sessionId = 0;
    this.paths = null;
    this.attributes = null;
  }

  public long getSessionId() {
    return this.sessionId;
  }

  public AddColumnsReq setSessionId(long sessionId) {
    this.sessionId = sessionId;
    setSessionIdIsSet(true);
    return this;
  }

  public void unsetSessionId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SESSIONID_ISSET_ID);
  }

  /** Returns true if field sessionId is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SESSIONID_ISSET_ID);
  }

  public void setSessionIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SESSIONID_ISSET_ID, value);
  }

  public int getPathsSize() {
    return (this.paths == null) ? 0 : this.paths.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getPathsIterator() {
    return (this.paths == null) ? null : this.paths.iterator();
  }

  public void addToPaths(java.lang.String elem) {
    if (this.paths == null) {
      this.paths = new java.util.ArrayList<java.lang.String>();
    }
    this.paths.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getPaths() {
    return this.paths;
  }

  public AddColumnsReq setPaths(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> paths) {
    this.paths = paths;
    return this;
  }

  public void unsetPaths() {
    this.paths = null;
  }

  /** Returns true if field paths is set (has been assigned a value) and false otherwise */
  public boolean isSetPaths() {
    return this.paths != null;
  }

  public void setPathsIsSet(boolean value) {
    if (!value) {
      this.paths = null;
    }
  }

  public int getAttributesSize() {
    return (this.attributes == null) ? 0 : this.attributes.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.util.Map<java.lang.String,java.nio.ByteBuffer>> getAttributesIterator() {
    return (this.attributes == null) ? null : this.attributes.iterator();
  }

  public void addToAttributes(java.util.Map<java.lang.String,java.nio.ByteBuffer> elem) {
    if (this.attributes == null) {
      this.attributes = new java.util.ArrayList<java.util.Map<java.lang.String,java.nio.ByteBuffer>>();
    }
    this.attributes.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.util.Map<java.lang.String,java.nio.ByteBuffer>> getAttributes() {
    return this.attributes;
  }

  public AddColumnsReq setAttributes(@org.apache.thrift.annotation.Nullable java.util.List<java.util.Map<java.lang.String,java.nio.ByteBuffer>> attributes) {
    this.attributes = attributes;
    return this;
  }

  public void unsetAttributes() {
    this.attributes = null;
  }

  /** Returns true if field attributes is set (has been assigned a value) and false otherwise */
  public boolean isSetAttributes() {
    return this.attributes != null;
  }

  public void setAttributesIsSet(boolean value) {
    if (!value) {
      this.attributes = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SESSION_ID:
      if (value == null) {
        unsetSessionId();
      } else {
        setSessionId((java.lang.Long)value);
      }
      break;

    case PATHS:
      if (value == null) {
        unsetPaths();
      } else {
        setPaths((java.util.List<java.lang.String>)value);
      }
      break;

    case ATTRIBUTES:
      if (value == null) {
        unsetAttributes();
      } else {
        setAttributes((java.util.List<java.util.Map<java.lang.String,java.nio.ByteBuffer>>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SESSION_ID:
      return getSessionId();

    case PATHS:
      return getPaths();

    case ATTRIBUTES:
      return getAttributes();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SESSION_ID:
      return isSetSessionId();
    case PATHS:
      return isSetPaths();
    case ATTRIBUTES:
      return isSetAttributes();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof AddColumnsReq)
      return this.equals((AddColumnsReq)that);
    return false;
  }

  public boolean equals(AddColumnsReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sessionId = true;
    boolean that_present_sessionId = true;
    if (this_present_sessionId || that_present_sessionId) {
      if (!(this_present_sessionId && that_present_sessionId))
        return false;
      if (this.sessionId != that.sessionId)
        return false;
    }

    boolean this_present_paths = true && this.isSetPaths();
    boolean that_present_paths = true && that.isSetPaths();
    if (this_present_paths || that_present_paths) {
      if (!(this_present_paths && that_present_paths))
        return false;
      if (!this.paths.equals(that.paths))
        return false;
    }

    boolean this_present_attributes = true && this.isSetAttributes();
    boolean that_present_attributes = true && that.isSetAttributes();
    if (this_present_attributes || that_present_attributes) {
      if (!(this_present_attributes && that_present_attributes))
        return false;
      if (!this.attributes.equals(that.attributes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(sessionId);

    hashCode = hashCode * 8191 + ((isSetPaths()) ? 131071 : 524287);
    if (isSetPaths())
      hashCode = hashCode * 8191 + paths.hashCode();

    hashCode = hashCode * 8191 + ((isSetAttributes()) ? 131071 : 524287);
    if (isSetAttributes())
      hashCode = hashCode * 8191 + attributes.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(AddColumnsReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSessionId()).compareTo(other.isSetSessionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionId, other.sessionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPaths()).compareTo(other.isSetPaths());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPaths()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paths, other.paths);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAttributes()).compareTo(other.isSetAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttributes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.attributes, other.attributes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AddColumnsReq(");
    boolean first = true;

    sb.append("sessionId:");
    sb.append(this.sessionId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("paths:");
    if (this.paths == null) {
      sb.append("null");
    } else {
      sb.append(this.paths);
    }
    first = false;
    if (isSetAttributes()) {
      if (!first) sb.append(", ");
      sb.append("attributes:");
      if (this.attributes == null) {
        sb.append("null");
      } else {
        sb.append(this.attributes);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'sessionId' because it's a primitive and you chose the non-beans generator.
    if (paths == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'paths' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AddColumnsReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AddColumnsReqStandardScheme getScheme() {
      return new AddColumnsReqStandardScheme();
    }
  }

  private static class AddColumnsReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<AddColumnsReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AddColumnsReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SESSION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.sessionId = iprot.readI64();
              struct.setSessionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PATHS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list44 = iprot.readListBegin();
                struct.paths = new java.util.ArrayList<java.lang.String>(_list44.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem45;
                for (int _i46 = 0; _i46 < _list44.size; ++_i46)
                {
                  _elem45 = iprot.readString();
                  struct.paths.add(_elem45);
                }
                iprot.readListEnd();
              }
              struct.setPathsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ATTRIBUTES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list47 = iprot.readListBegin();
                struct.attributes = new java.util.ArrayList<java.util.Map<java.lang.String,java.nio.ByteBuffer>>(_list47.size);
                @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.nio.ByteBuffer> _elem48;
                for (int _i49 = 0; _i49 < _list47.size; ++_i49)
                {
                  {
                    org.apache.thrift.protocol.TMap _map50 = iprot.readMapBegin();
                    _elem48 = new java.util.HashMap<java.lang.String,java.nio.ByteBuffer>(2*_map50.size);
                    @org.apache.thrift.annotation.Nullable java.lang.String _key51;
                    @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer _val52;
                    for (int _i53 = 0; _i53 < _map50.size; ++_i53)
                    {
                      _key51 = iprot.readString();
                      _val52 = iprot.readBinary();
                      _elem48.put(_key51, _val52);
                    }
                    iprot.readMapEnd();
                  }
                  struct.attributes.add(_elem48);
                }
                iprot.readListEnd();
              }
              struct.setAttributesIsSet(true);
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
      if (!struct.isSetSessionId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'sessionId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AddColumnsReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SESSION_ID_FIELD_DESC);
      oprot.writeI64(struct.sessionId);
      oprot.writeFieldEnd();
      if (struct.paths != null) {
        oprot.writeFieldBegin(PATHS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.paths.size()));
          for (java.lang.String _iter54 : struct.paths)
          {
            oprot.writeString(_iter54);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.attributes != null) {
        if (struct.isSetAttributes()) {
          oprot.writeFieldBegin(ATTRIBUTES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.MAP, struct.attributes.size()));
            for (java.util.Map<java.lang.String,java.nio.ByteBuffer> _iter55 : struct.attributes)
            {
              {
                oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, _iter55.size()));
                for (java.util.Map.Entry<java.lang.String, java.nio.ByteBuffer> _iter56 : _iter55.entrySet())
                {
                  oprot.writeString(_iter56.getKey());
                  oprot.writeBinary(_iter56.getValue());
                }
                oprot.writeMapEnd();
              }
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddColumnsReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AddColumnsReqTupleScheme getScheme() {
      return new AddColumnsReqTupleScheme();
    }
  }

  private static class AddColumnsReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<AddColumnsReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AddColumnsReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.sessionId);
      {
        oprot.writeI32(struct.paths.size());
        for (java.lang.String _iter57 : struct.paths)
        {
          oprot.writeString(_iter57);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAttributes()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetAttributes()) {
        {
          oprot.writeI32(struct.attributes.size());
          for (java.util.Map<java.lang.String,java.nio.ByteBuffer> _iter58 : struct.attributes)
          {
            {
              oprot.writeI32(_iter58.size());
              for (java.util.Map.Entry<java.lang.String, java.nio.ByteBuffer> _iter59 : _iter58.entrySet())
              {
                oprot.writeString(_iter59.getKey());
                oprot.writeBinary(_iter59.getValue());
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AddColumnsReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.sessionId = iprot.readI64();
      struct.setSessionIdIsSet(true);
      {
        org.apache.thrift.protocol.TList _list60 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.paths = new java.util.ArrayList<java.lang.String>(_list60.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _elem61;
        for (int _i62 = 0; _i62 < _list60.size; ++_i62)
        {
          _elem61 = iprot.readString();
          struct.paths.add(_elem61);
        }
      }
      struct.setPathsIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list63 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.MAP, iprot.readI32());
          struct.attributes = new java.util.ArrayList<java.util.Map<java.lang.String,java.nio.ByteBuffer>>(_list63.size);
          @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,java.nio.ByteBuffer> _elem64;
          for (int _i65 = 0; _i65 < _list63.size; ++_i65)
          {
            {
              org.apache.thrift.protocol.TMap _map66 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
              _elem64 = new java.util.HashMap<java.lang.String,java.nio.ByteBuffer>(2*_map66.size);
              @org.apache.thrift.annotation.Nullable java.lang.String _key67;
              @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer _val68;
              for (int _i69 = 0; _i69 < _map66.size; ++_i69)
              {
                _key67 = iprot.readString();
                _val68 = iprot.readBinary();
                _elem64.put(_key67, _val68);
              }
            }
            struct.attributes.add(_elem64);
          }
        }
        struct.setAttributesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

