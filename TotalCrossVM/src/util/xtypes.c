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

#include "tcvm.h"
#include <ctype.h>

///////////////////////////////////////////////////////////////////////////
//                               string                                  //
///////////////////////////////////////////////////////////////////////////

CharP xstrncpy(CharP target, CharP source, int32 len)
{
   CharP t = target;
   while (len-- > 0 && *source)
      *target++ = *source++;
   *target = 0;
   return t;
}

CharP xstrrchr(CharP str, int32 ch)
{
   CharP strP;
   CharP resP = null;

   for (strP = str ; *strP != 0 ; strP++)
      if (*strP == ch)
         resP = strP;
   return resP;
}

int32 xstrncasecmp(const char *a1, const char *a2, int32 size)
{
   char c1, c2;
   /* Want both assignments to happen but a 0 in both to quit, so it's | not || */
   while((size > 0) && (c1=*a1) | (c2=*a2))
   {
      if (!c1 || !c2 || toupper(c1) != toupper(c2))
         return (c1 - c2);
      a1++;
      a2++;
      size--;
   }
   return 0;
}
