/*********************************************************************************
 *  TotalCross Software Development Kit                                          *
 *  Copyright (C) 2000-2012 SuperWaba Ltda.                                      *
 *  Copyright (C) 2012-2020 TotalCross Global Mobile Platform Ltda.              *
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

package tc.tools.converter.bytecode;

import tc.tools.converter.TCValue;

public class BC190_arraylength extends ByteCode {
  public int resultPos, objPos;

  public BC190_arraylength() {
    objPos = resultPos = -1;
    stackInc = 0;
  }

  @Override
  public void exec() {
    TCValue v = stack[stackPtr - 1];
    if (!"array".equals(v.asObj)) {
      System.out.println("Not an array!");
    }
    stack[stackPtr - 1].asInt = v.asInt;
  }
}
