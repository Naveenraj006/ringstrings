// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ringstrings.proto at 11:1
package com.coreman2200.ringstrings.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

/**
 * Profile Data Bundle describing anticipated values to build symbol charts.
 */
public final class LocalProfileDataBundle extends Message<LocalProfileDataBundle, LocalProfileDataBundle.Builder> {
  public static final ProtoAdapter<LocalProfileDataBundle> ADAPTER = new ProtoAdapter<LocalProfileDataBundle>(FieldEncoding.LENGTH_DELIMITED, LocalProfileDataBundle.class) {
    @Override
    public int encodedSize(LocalProfileDataBundle value) {
      return (value.profile_id != null ? ProtoAdapter.INT32.encodedSizeWithTag(1, value.profile_id) : 0)
          + (value.display_name != null ? Name.ADAPTER.encodedSizeWithTag(2, value.display_name) : 0)
          + (value.full_name != null ? Name.ADAPTER.encodedSizeWithTag(3, value.full_name) : 0)
          + (value.birth_placement != null ? Placement.ADAPTER.encodedSizeWithTag(4, value.birth_placement) : 0)
          + (value.recent_placement != null ? Placement.ADAPTER.encodedSizeWithTag(5, value.recent_placement) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, LocalProfileDataBundle value) throws IOException {
      if (value.profile_id != null) ProtoAdapter.INT32.encodeWithTag(writer, 1, value.profile_id);
      if (value.display_name != null) Name.ADAPTER.encodeWithTag(writer, 2, value.display_name);
      if (value.full_name != null) Name.ADAPTER.encodeWithTag(writer, 3, value.full_name);
      if (value.birth_placement != null) Placement.ADAPTER.encodeWithTag(writer, 4, value.birth_placement);
      if (value.recent_placement != null) Placement.ADAPTER.encodeWithTag(writer, 5, value.recent_placement);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public LocalProfileDataBundle decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.profile_id(ProtoAdapter.INT32.decode(reader)); break;
          case 2: builder.display_name(Name.ADAPTER.decode(reader)); break;
          case 3: builder.full_name(Name.ADAPTER.decode(reader)); break;
          case 4: builder.birth_placement(Placement.ADAPTER.decode(reader)); break;
          case 5: builder.recent_placement(Placement.ADAPTER.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public LocalProfileDataBundle redact(LocalProfileDataBundle value) {
      Builder builder = value.newBuilder();
      if (builder.display_name != null) builder.display_name = Name.ADAPTER.redact(builder.display_name);
      if (builder.full_name != null) builder.full_name = Name.ADAPTER.redact(builder.full_name);
      if (builder.birth_placement != null) builder.birth_placement = Placement.ADAPTER.redact(builder.birth_placement);
      if (builder.recent_placement != null) builder.recent_placement = Placement.ADAPTER.redact(builder.recent_placement);
      builder.clearUnknownFields();
      return builder.build();
    }
  };

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_PROFILE_ID = 0;

  /**
   * Identifier for profile
   */
  public final Integer profile_id;

  /**
   * Name for display purposes..
   */
  public final Name display_name;

  /**
   * Name for chart making..
   */
  public final Name full_name;

  /**
   * Geographical/temporal placement for birth chart(s) in profile
   */
  public final Placement birth_placement;

  /**
   * Geographical/temporal placement for current chart(s) in profile
   */
  public final Placement recent_placement;

  public LocalProfileDataBundle(Integer profile_id, Name display_name, Name full_name, Placement birth_placement, Placement recent_placement) {
    this(profile_id, display_name, full_name, birth_placement, recent_placement, ByteString.EMPTY);
  }

  public LocalProfileDataBundle(Integer profile_id, Name display_name, Name full_name, Placement birth_placement, Placement recent_placement, ByteString unknownFields) {
    super(unknownFields);
    this.profile_id = profile_id;
    this.display_name = display_name;
    this.full_name = full_name;
    this.birth_placement = birth_placement;
    this.recent_placement = recent_placement;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.profile_id = profile_id;
    builder.display_name = display_name;
    builder.full_name = full_name;
    builder.birth_placement = birth_placement;
    builder.recent_placement = recent_placement;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof LocalProfileDataBundle)) return false;
    LocalProfileDataBundle o = (LocalProfileDataBundle) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(profile_id, o.profile_id)
        && equals(display_name, o.display_name)
        && equals(full_name, o.full_name)
        && equals(birth_placement, o.birth_placement)
        && equals(recent_placement, o.recent_placement);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (profile_id != null ? profile_id.hashCode() : 0);
      result = result * 37 + (display_name != null ? display_name.hashCode() : 0);
      result = result * 37 + (full_name != null ? full_name.hashCode() : 0);
      result = result * 37 + (birth_placement != null ? birth_placement.hashCode() : 0);
      result = result * 37 + (recent_placement != null ? recent_placement.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (profile_id != null) builder.append(", profile_id=").append(profile_id);
    if (display_name != null) builder.append(", display_name=").append(display_name);
    if (full_name != null) builder.append(", full_name=").append(full_name);
    if (birth_placement != null) builder.append(", birth_placement=").append(birth_placement);
    if (recent_placement != null) builder.append(", recent_placement=").append(recent_placement);
    return builder.replace(0, 2, "LocalProfileDataBundle{").append('}').toString();
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<LocalProfileDataBundle, Builder> {
    public Integer profile_id;

    public Name display_name;

    public Name full_name;

    public Placement birth_placement;

    public Placement recent_placement;

    public Builder() {
    }

    /**
     * Identifier for profile
     */
    public Builder profile_id(Integer profile_id) {
      this.profile_id = profile_id;
      return this;
    }

    /**
     * Name for display purposes..
     */
    public Builder display_name(Name display_name) {
      this.display_name = display_name;
      return this;
    }

    /**
     * Name for chart making..
     */
    public Builder full_name(Name full_name) {
      this.full_name = full_name;
      return this;
    }

    /**
     * Geographical/temporal placement for birth chart(s) in profile
     */
    public Builder birth_placement(Placement birth_placement) {
      this.birth_placement = birth_placement;
      return this;
    }

    /**
     * Geographical/temporal placement for current chart(s) in profile
     */
    public Builder recent_placement(Placement recent_placement) {
      this.recent_placement = recent_placement;
      return this;
    }

    @Override
    public LocalProfileDataBundle build() {
      return new LocalProfileDataBundle(profile_id, display_name, full_name, birth_placement, recent_placement, buildUnknownFields());
    }
  }

  /**
   * Full name for profile broken into segments
   */
  public static final class Name extends Message<Name, Name.Builder> {
    public static final ProtoAdapter<Name> ADAPTER = new ProtoAdapter<Name>(FieldEncoding.LENGTH_DELIMITED, Name.class) {
      @Override
      public int encodedSize(Name value) {
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.segments)
            + value.unknownFields().size();
      }

      @Override
      public void encode(ProtoWriter writer, Name value) throws IOException {
        if (value.segments != null) ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.segments);
        writer.writeBytes(value.unknownFields());
      }

      @Override
      public Name decode(ProtoReader reader) throws IOException {
        Name.Builder builder = new Name.Builder();
        long token = reader.beginMessage();
        for (int tag; (tag = reader.nextTag()) != -1;) {
          switch (tag) {
            case 1: builder.segments.add(ProtoAdapter.STRING.decode(reader)); break;
            default: {
              FieldEncoding fieldEncoding = reader.peekFieldEncoding();
              Object value = fieldEncoding.rawProtoAdapter().decode(reader);
              builder.addUnknownField(tag, fieldEncoding, value);
            }
          }
        }
        reader.endMessage(token);
        return builder.build();
      }

      @Override
      public Name redact(Name value) {
        Name.Builder builder = value.newBuilder();
        builder.clearUnknownFields();
        return builder.build();
      }
    };

    private static final long serialVersionUID = 0L;

    public final List<String> segments;

    public Name(List<String> segments) {
      this(segments, ByteString.EMPTY);
    }

    public Name(List<String> segments, ByteString unknownFields) {
      super(unknownFields);
      this.segments = immutableCopyOf("segments", segments);
    }

    @Override
    public Name.Builder newBuilder() {
      Name.Builder builder = new Name.Builder();
      builder.segments = copyOf("segments", segments);
      builder.addUnknownFields(unknownFields());
      return builder;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof Name)) return false;
      Name o = (Name) other;
      return equals(unknownFields(), o.unknownFields())
          && equals(segments, o.segments);
    }

    @Override
    public int hashCode() {
      int result = super.hashCode;
      if (result == 0) {
        result = unknownFields().hashCode();
        result = result * 37 + (segments != null ? segments.hashCode() : 1);
        super.hashCode = result;
      }
      return result;
    }

    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder();
      if (segments != null) builder.append(", segments=").append(segments);
      return builder.replace(0, 2, "Name{").append('}').toString();
    }

    public static final class Builder extends com.squareup.wire.Message.Builder<Name, Name.Builder> {
      public List<String> segments;

      public Builder() {
        segments = newMutableList();
      }

      public Builder segments(List<String> segments) {
        checkElementsNotNull(segments);
        this.segments = segments;
        return this;
      }

      @Override
      public Name build() {
        return new Name(segments, buildUnknownFields());
      }
    }
  }

  /**
   * Geographical, temporal placement for profile
   */
  public static final class Placement extends Message<Placement, Placement.Builder> {
    public static final ProtoAdapter<Placement> ADAPTER = new ProtoAdapter<Placement>(FieldEncoding.LENGTH_DELIMITED, Placement.class) {
      @Override
      public int encodedSize(Placement value) {
        return (value.geo != null ? Location.ADAPTER.encodedSizeWithTag(1, value.geo) : 0)
            + (value.timestamp != null ? ProtoAdapter.INT64.encodedSizeWithTag(2, value.timestamp) : 0)
            + (value.timezone != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.timezone) : 0)
            + value.unknownFields().size();
      }

      @Override
      public void encode(ProtoWriter writer, Placement value) throws IOException {
        if (value.geo != null) Location.ADAPTER.encodeWithTag(writer, 1, value.geo);
        if (value.timestamp != null) ProtoAdapter.INT64.encodeWithTag(writer, 2, value.timestamp);
        if (value.timezone != null) ProtoAdapter.STRING.encodeWithTag(writer, 3, value.timezone);
        writer.writeBytes(value.unknownFields());
      }

      @Override
      public Placement decode(ProtoReader reader) throws IOException {
        Placement.Builder builder = new Placement.Builder();
        long token = reader.beginMessage();
        for (int tag; (tag = reader.nextTag()) != -1;) {
          switch (tag) {
            case 1: builder.geo(Location.ADAPTER.decode(reader)); break;
            case 2: builder.timestamp(ProtoAdapter.INT64.decode(reader)); break;
            case 3: builder.timezone(ProtoAdapter.STRING.decode(reader)); break;
            default: {
              FieldEncoding fieldEncoding = reader.peekFieldEncoding();
              Object value = fieldEncoding.rawProtoAdapter().decode(reader);
              builder.addUnknownField(tag, fieldEncoding, value);
            }
          }
        }
        reader.endMessage(token);
        return builder.build();
      }

      @Override
      public Placement redact(Placement value) {
        Placement.Builder builder = value.newBuilder();
        if (builder.geo != null) builder.geo = Location.ADAPTER.redact(builder.geo);
        builder.clearUnknownFields();
        return builder.build();
      }
    };

    private static final long serialVersionUID = 0L;

    public static final Long DEFAULT_TIMESTAMP = 0L;

    public static final String DEFAULT_TIMEZONE = "";

    public final Location geo;

    public final Long timestamp;

    public final String timezone;

    public Placement(Location geo, Long timestamp, String timezone) {
      this(geo, timestamp, timezone, ByteString.EMPTY);
    }

    public Placement(Location geo, Long timestamp, String timezone, ByteString unknownFields) {
      super(unknownFields);
      this.geo = geo;
      this.timestamp = timestamp;
      this.timezone = timezone;
    }

    @Override
    public Placement.Builder newBuilder() {
      Placement.Builder builder = new Placement.Builder();
      builder.geo = geo;
      builder.timestamp = timestamp;
      builder.timezone = timezone;
      builder.addUnknownFields(unknownFields());
      return builder;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof Placement)) return false;
      Placement o = (Placement) other;
      return equals(unknownFields(), o.unknownFields())
          && equals(geo, o.geo)
          && equals(timestamp, o.timestamp)
          && equals(timezone, o.timezone);
    }

    @Override
    public int hashCode() {
      int result = super.hashCode;
      if (result == 0) {
        result = unknownFields().hashCode();
        result = result * 37 + (geo != null ? geo.hashCode() : 0);
        result = result * 37 + (timestamp != null ? timestamp.hashCode() : 0);
        result = result * 37 + (timezone != null ? timezone.hashCode() : 0);
        super.hashCode = result;
      }
      return result;
    }

    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder();
      if (geo != null) builder.append(", geo=").append(geo);
      if (timestamp != null) builder.append(", timestamp=").append(timestamp);
      if (timezone != null) builder.append(", timezone=").append(timezone);
      return builder.replace(0, 2, "Placement{").append('}').toString();
    }

    public static final class Builder extends com.squareup.wire.Message.Builder<Placement, Placement.Builder> {
      public Location geo;

      public Long timestamp;

      public String timezone;

      public Builder() {
      }

      public Builder geo(Location geo) {
        this.geo = geo;
        return this;
      }

      public Builder timestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
      }

      public Builder timezone(String timezone) {
        this.timezone = timezone;
        return this;
      }

      @Override
      public Placement build() {
        return new Placement(geo, timestamp, timezone, buildUnknownFields());
      }
    }

    public static final class Location extends Message<Location, Location.Builder> {
      public static final ProtoAdapter<Location> ADAPTER = new ProtoAdapter<Location>(FieldEncoding.LENGTH_DELIMITED, Location.class) {
        @Override
        public int encodedSize(Location value) {
          return (value.longitude != null ? ProtoAdapter.DOUBLE.encodedSizeWithTag(1, value.longitude) : 0)
              + (value.latitude != null ? ProtoAdapter.DOUBLE.encodedSizeWithTag(2, value.latitude) : 0)
              + (value.altitude != null ? ProtoAdapter.DOUBLE.encodedSizeWithTag(3, value.altitude) : 0)
              + value.unknownFields().size();
        }

        @Override
        public void encode(ProtoWriter writer, Location value) throws IOException {
          if (value.longitude != null) ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, value.longitude);
          if (value.latitude != null) ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, value.latitude);
          if (value.altitude != null) ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, value.altitude);
          writer.writeBytes(value.unknownFields());
        }

        @Override
        public Location decode(ProtoReader reader) throws IOException {
          Location.Builder builder = new Location.Builder();
          long token = reader.beginMessage();
          for (int tag; (tag = reader.nextTag()) != -1;) {
            switch (tag) {
              case 1: builder.longitude(ProtoAdapter.DOUBLE.decode(reader)); break;
              case 2: builder.latitude(ProtoAdapter.DOUBLE.decode(reader)); break;
              case 3: builder.altitude(ProtoAdapter.DOUBLE.decode(reader)); break;
              default: {
                FieldEncoding fieldEncoding = reader.peekFieldEncoding();
                Object value = fieldEncoding.rawProtoAdapter().decode(reader);
                builder.addUnknownField(tag, fieldEncoding, value);
              }
            }
          }
          reader.endMessage(token);
          return builder.build();
        }

        @Override
        public Location redact(Location value) {
          Location.Builder builder = value.newBuilder();
          builder.clearUnknownFields();
          return builder.build();
        }
      };

      private static final long serialVersionUID = 0L;

      public static final Double DEFAULT_LONGITUDE = 0.0d;

      public static final Double DEFAULT_LATITUDE = 0.0d;

      public static final Double DEFAULT_ALTITUDE = 0.0d;

      public final Double longitude;

      public final Double latitude;

      public final Double altitude;

      public Location(Double longitude, Double latitude, Double altitude) {
        this(longitude, latitude, altitude, ByteString.EMPTY);
      }

      public Location(Double longitude, Double latitude, Double altitude, ByteString unknownFields) {
        super(unknownFields);
        this.longitude = longitude;
        this.latitude = latitude;
        this.altitude = altitude;
      }

      @Override
      public Location.Builder newBuilder() {
        Location.Builder builder = new Location.Builder();
        builder.longitude = longitude;
        builder.latitude = latitude;
        builder.altitude = altitude;
        builder.addUnknownFields(unknownFields());
        return builder;
      }

      @Override
      public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Location)) return false;
        Location o = (Location) other;
        return equals(unknownFields(), o.unknownFields())
            && equals(longitude, o.longitude)
            && equals(latitude, o.latitude)
            && equals(altitude, o.altitude);
      }

      @Override
      public int hashCode() {
        int result = super.hashCode;
        if (result == 0) {
          result = unknownFields().hashCode();
          result = result * 37 + (longitude != null ? longitude.hashCode() : 0);
          result = result * 37 + (latitude != null ? latitude.hashCode() : 0);
          result = result * 37 + (altitude != null ? altitude.hashCode() : 0);
          super.hashCode = result;
        }
        return result;
      }

      @Override
      public String toString() {
        StringBuilder builder = new StringBuilder();
        if (longitude != null) builder.append(", longitude=").append(longitude);
        if (latitude != null) builder.append(", latitude=").append(latitude);
        if (altitude != null) builder.append(", altitude=").append(altitude);
        return builder.replace(0, 2, "Location{").append('}').toString();
      }

      public static final class Builder extends com.squareup.wire.Message.Builder<Location, Location.Builder> {
        public Double longitude;

        public Double latitude;

        public Double altitude;

        public Builder() {
        }

        public Builder longitude(Double longitude) {
          this.longitude = longitude;
          return this;
        }

        public Builder latitude(Double latitude) {
          this.latitude = latitude;
          return this;
        }

        public Builder altitude(Double altitude) {
          this.altitude = altitude;
          return this;
        }

        @Override
        public Location build() {
          return new Location(longitude, latitude, altitude, buildUnknownFields());
        }
      }
    }
  }
}
