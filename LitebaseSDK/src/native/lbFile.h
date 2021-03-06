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

/**
 * This module declares functions that handles files.
 */

#ifndef LITEBASE_LBFILE_H
#define LITEBASE_LBFILE_H

#include "Litebase.h"

extern Err lbfileCreate(NATIVE_FILE* fref, TCHARP path, int32 mode);
extern Err lbfileClose(NATIVE_FILE* fref);
extern Err lbfileCreateDir(TCHARP path);
extern Err lbfileDelete(NATIVE_FILE* fref, TCHARP path, bool isOpen);
extern bool lbfileExists(TCHARP path);
extern Err lbfileGetSize(NATIVE_FILE fref, TCHARP szPath, int32* size);
extern Err lbfileReadBytes(NATIVE_FILE fref, CharP bytes, int32 offset, int32 length, int32* bytesRead);
extern Err lbfileRename(NATIVE_FILE fref, TCHARP currPath, TCHARP newPath, bool isOpen);
extern Err lbfileSetPos(NATIVE_FILE fref, int32 position);
extern Err lbfileWriteBytes(NATIVE_FILE fref, CharP bytes, int32 offset, int32 length, int32* bytesWritten);
extern Err lbfileSetSize(NATIVE_FILE* fref, int32 newSize);
extern Err lbfileFlush(NATIVE_FILE fref);

#endif
