/*
 * Copyright 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.benchmark.config.blueprint;

import org.optaplanner.benchmark.impl.ranking.TotalRankSolverRankingWeightFactory;
import org.optaplanner.benchmark.impl.ranking.TotalScoreSolverRankingComparator;
import org.optaplanner.benchmark.impl.ranking.WorstScoreSolverRankingComparator;
import org.optaplanner.core.api.domain.solution.Solution;
import org.optaplanner.core.config.constructionheuristic.ConstructionHeuristicType;

public enum SolverBenchmarkBluePrintType {
    /**
     * @see ConstructionHeuristicType
     */
    ALL_CONSTRUCTION_HEURISTIC_TYPES;

}