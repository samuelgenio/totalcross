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

package totalcross.unit;

import totalcross.sys.Vm;
import totalcross.ui.MainWindow;
import totalcross.ui.event.Event;

/** Event sent when a Robot runs.
 * The target is always the MainWindow's instance.
 */
public class UIRobotEvent extends Event<UIRobotListener> {
  /** Event indicating that the robot has succeed. */
  public static final int ROBOT_SUCCEED = 350;
  /** Event indicating that the robot has failed. Check the failureReason field for more information. */
  public static final int ROBOT_FAILED = 351;

  static final int ROBOT_EOF = 352;

  /** The name of the robot that was running. */
  public String robotName;

  /** The reason of the failure, if any. */
  public String failureReason;

  UIRobotEvent(int type, String robotName, String reason) {
    super(type, MainWindow.getMainWindow(), Vm.getTimeStamp());
    this.robotName = robotName;
    this.failureReason = reason;
  }

  @Override
  public void dispatch(UIRobotListener listener) {
    if (this.type == ROBOT_SUCCEED) {
      listener.robotSucceed(this);
    } else if (this.type == ROBOT_FAILED) {
      listener.robotFailed(this);
    }
  }
}
