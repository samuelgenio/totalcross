/*********************************************************************************
 *  TotalCross Software Development Kit                                          *
 *  Copyright (C) 2017-2020 TotalCross Global Mobile Platform Ltda.              *
 *  All Rights Reserved                                                          *
 *                                                                               *
 *  This library and virtual machine is distributed in the hope that it will     *
 *  be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of    *
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.                         *
 *                                                                               *
 *  This file is covered by the GNU LESSER GENERAL PUBLIC LICENSE VERSION 2.1    *
 *  A copy of this license is located in file license.txt at the root of this    *
 *  SDK or can be downloaded here:                                               *
 *  http://www.gnu.org/licenses/lgpl-2.1.txt                                     *
 *                                                                               *
 *********************************************************************************/

package jdkcompat.io;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public abstract class Writer4D implements Closeable, Flushable {

  public void write(int charEquiv) throws IOException {
    char buff[] = new char[] { (char) (charEquiv & 0xffff) };
    write(buff, 0, 1);
  }

  public void write(char[] buff) throws IOException {
    write(buff, 0, buff.length);
  }

  public void write(String str) throws IOException {
    write(str.toCharArray(), 0, str.length());
  }

  public void write(String str, int offset, int length) throws IOException {
    char[] dst = new char[length];
    str.getChars(offset, offset + length, dst, 0);
    write(dst, 0, length);
  }

  public void append(char c) throws IOException {
    write(c);
  }

  public void append(String str) throws IOException {
    write(str);
  }

  public void append(String str, int start, int end) throws IOException {
    write(str.substring(start, end));
  }

  public abstract void write(char[] buff, int offset, int length) throws IOException;
}
