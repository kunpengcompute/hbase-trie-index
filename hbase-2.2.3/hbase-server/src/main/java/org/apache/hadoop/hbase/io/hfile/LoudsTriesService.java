package org.apache.hadoop.hbase.io.hfile;

import java.io.DataOutput;
import java.io.IOException;
import java.util.List;
import java.util.ServiceLoader;

import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.nio.ByteBuff;
import org.apache.yetus.audience.InterfaceAudience;

@InterfaceAudience.Private
public interface LoudsTriesService {
  public static LoudsTriesService INSTANCE = initInstance();

  static LoudsTriesService initInstance() {
    for (LoudsTriesService mgr : ServiceLoader.load(LoudsTriesService.class)) {
      return mgr;
    }
    throw new NoClassDefFoundError("no implementation found for abstract class " + LoudsTriesService.class);
  }

  void build(List<byte[]> keys, long[] offsets, int[] lengths, DataOutput out) throws IOException;

  ValueInfo get(ByteBuff buff, Cell key);
}
