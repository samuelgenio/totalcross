/*********************************************************************************
 *  TotalCross Software Development Kit                                          *
 *  Copyright (C) 2000-2012 SuperWaba Ltda.                                      *
 *  Copyright (C) 2012-2020 TotalCross Global Mobile Platform Ltda.   
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

package totalcross.lang.reflect;

public class Array4D {
  public static native Object newInstance(Class<?> componentType, int length) throws NegativeArraySizeException;

  public static native Object newInstance(Class<?> componentType, int dimensions[])
      throws IllegalArgumentException, NegativeArraySizeException;

  public static native int getLength(Object array) throws IllegalArgumentException;

  public static native Object get(Object array, int index)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

  public static native boolean getBoolean(Object array, int index)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

  public static native byte getByte(Object array, int index)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

  public static native char getChar(Object array, int index)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

  public static native short getShort(Object array, int index)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

  public static native int getInt(Object array, int index)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

  public static native long getLong(Object array, int index)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

  public static native double getFloat(Object array, int index)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

  public static native double getDouble(Object array, int index)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

  public static native void set(Object array, int index, Object value)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

  public static native void setBoolean(Object array, int index, boolean z)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

  public static native void setByte(Object array, int index, byte b)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

  public static native void setChar(Object array, int index, char c)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

  public static native void setShort(Object array, int index, short s)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

  public static native void setInt(Object array, int index, int i)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

  public static native void setLong(Object array, int index, long l)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

  public static native void setFloat(Object array, int index, double f)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;

  public static native void setDouble(Object array, int index, double d)
      throws IllegalArgumentException, ArrayIndexOutOfBoundsException;
}
