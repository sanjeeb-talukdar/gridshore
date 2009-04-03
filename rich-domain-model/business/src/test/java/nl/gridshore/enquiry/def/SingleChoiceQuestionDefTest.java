/*
 * Copyright (c) 2009. Gridshore
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nl.gridshore.enquiry.def;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SingleChoiceQuestionDefTest {

    @Test
    public void testConstructor() {
        List<ChoiceDef> choiceDefs = new ArrayList<ChoiceDef>();
        final ChoiceDef choiceDef = new ChoiceDef();
        final ChoiceDef choiceDef2 = new ChoiceDef();
        choiceDefs.add(choiceDef);
        choiceDefs.add(choiceDef2);
        SingleChoiceQuestionDef testSubject = new SingleChoiceQuestionDef("Test", choiceDefs);

        assertEquals("Test", testSubject.getQuestionText());
        assertEquals(2, testSubject.getChoiceDefs().size());
        assertSame(choiceDef, testSubject.getChoiceDefs().get(0));
        assertEquals(1, choiceDef2.getIndex());
    }
}
