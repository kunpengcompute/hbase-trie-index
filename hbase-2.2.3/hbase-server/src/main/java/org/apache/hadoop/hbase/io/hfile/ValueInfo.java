package org.apache.hadoop.hbase.io.hfile;

import org.apache.yetus.audience.InterfaceAudience;

@InterfaceAudience.Private
public class ValueInfo {
  public final long blockOffset;
  public final int blockLength;

  public ValueInfo(long blockOffset, int blockLength) {
    this.blockOffset = blockOffset;
    this.blockLength = blockLength;
  }
}
