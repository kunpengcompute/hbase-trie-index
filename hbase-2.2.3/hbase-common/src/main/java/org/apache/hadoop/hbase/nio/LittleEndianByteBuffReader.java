package org.apache.hadoop.hbase.nio;

import org.apache.yetus.audience.InterfaceAudience;

@InterfaceAudience.Private
public interface LittleEndianByteBuffReader {
  int getLittleEndianInt(int index);

  long getLittleEndianLong(int index);

  byte get(int index);
}
