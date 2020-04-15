/*
 * Copyright 2016 Jan Van Haaren (KU Leuven)
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

package liftedinference.learning.structure.task;

import java.io.File;
import java.util.List;

import liftedinference.learning.structure.model.Model;

/**
 * This class can be used to build WFOMC tasks.
 * 
 * @author Jan Van Haaren <jan.vanhaaren@cs.kuleuven.be>
 * @date Wednesday 3 July 2013
 */
public class TaskBuilder {

	public static ScoreTask buildScoreTask(Model model, List<File> databases) {
		return new ScoreTask(model, databases);
	}

}
