/**********
    Copyright © 2010-2012 Olanto Foundation Geneva

   This file is part of myMT.

   myMT is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of
    the License, or (at your option) any later version.

    myMT is distributed in the hope that it will be useful, but
    WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
    See the GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with myMT.  If not, see <http://www.gnu.org/licenses/>.

**********/
package org.olanto.smt.lineseg;

import java.util.List;

/**
 *
  */
public class testSeg {

    public static void main(String[] args){
        FileSegmentationMany fs=new FileSegmentationMany();
         List<String> seg=fs.readFile("Le chat est noir. Le chien est blanc. 2. Un titre. Le taux en vigeur est de 3.5 %. Le chat est noir. Le chien est blanc.");
             for (String s : seg) {
                System.out.println(s);
                }
  }

}
