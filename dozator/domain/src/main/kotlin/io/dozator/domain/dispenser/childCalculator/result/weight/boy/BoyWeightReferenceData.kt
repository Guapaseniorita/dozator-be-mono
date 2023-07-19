package io.dozator.domain.dispenser.childCalculator.result.weight.boy

import io.dozator.domain.dispenser.childCalculator.ChildCalculatorResultType
import io.dozator.domain.dispenser.childCalculator.result.child.ReferenceData
import weight.boy.*

class BoyWeightReferenceData(weight: Double) : ReferenceData() {
    override val type: ChildCalculatorResultType = ChildCalculatorResultType.BOY_WEIGHT
    init {
        references["0.0.0"] = Boy0_0_0ChildListWeight(weight)
        references["0.0.1"] = Boy0_0_1ChildListWeight(weight)
        references["0.0.2"] = Boy0_0_2ChildListWeight(weight)
        references["0.0.3"] = Boy0_0_3ChildListWeight(weight)
        references["0.0.4"] = Boy0_0_4ChildListWeight(weight)
        references["0.0.5"] = Boy0_0_5ChildListWeight(weight)
        references["0.0.6"] = Boy0_0_6ChildListWeight(weight)
        references["0.0.7"] = Boy0_0_7ChildListWeight(weight)
        references["0.0.8"] = Boy0_0_8ChildListWeight(weight)
        references["0.0.9"] = Boy0_0_9ChildListWeight(weight)
        references["0.0.10"] = Boy0_0_10ChildListWeight(weight)
        references["0.0.11"] = Boy0_0_11ChildListWeight(weight)
        references["0.0.12"] = Boy0_0_12ChildListWeight(weight)
        references["0.0.13"] = Boy0_0_13ChildListWeight(weight)
        references["0.3"] = Boy0_3ChildListWeight(weight)
        references["0.4"] = Boy0_4ChildListWeight(weight)
        references["0.5"] = Boy0_5ChildListWeight(weight)
        references["0.6"] = Boy0_6ChildListWeight(weight)
        references["0.7"] = Boy0_7ChildListWeight(weight)
        references["0.8"] = Boy0_8ChildListWeight(weight)
        references["0.9"] = Boy0_9ChildListWeight(weight)
        references["0.10"] = Boy0_10ChildListWeight(weight)
        references["0.11"] = Boy0_11ChildListWeight(weight)
        references["1.0"] = Boy1_0ChildListWeight(weight)
        references["1.1"] = Boy1_1ChildListWeight(weight)
        references["1.2"] = Boy1_2ChildListWeight(weight)
        references["1.3"] = Boy1_3ChildListWeight(weight)
        references["1.4"] = Boy1_4ChildListWeight(weight)
        references["1.5"] = Boy1_5ChildListWeight(weight)
        references["1.6"] = Boy1_6ChildListWeight(weight)
        references["1.7"] = Boy1_7ChildListWeight(weight)
        references["1.8"] = Boy1_8ChildListWeight(weight)
        references["1.9"] = Boy1_9ChildListWeight(weight)
        references["1.10"] = Boy1_10ChildListWeight(weight)
        references["1.11"] = Boy1_11ChildListWeight(weight)
        references["2.0"] = Boy2_0ChildListWeight(weight)
        references["2.1"] = Boy2_1ChildListWeight(weight)
        references["2.2"] = Boy2_2ChildListWeight(weight)
        references["2.3"] = Boy2_3ChildListWeight(weight)
        references["2.4"] = Boy2_4ChildListWeight(weight)
        references["2.5"] = Boy2_5ChildListWeight(weight)
        references["2.6"] = Boy2_6ChildListWeight(weight)
        references["2.7"] = Boy2_7ChildListWeight(weight)
        references["2.8"] = Boy2_8ChildListWeight(weight)
        references["2.9"] = Boy2_9ChildListWeight(weight)
        references["2.10"] = Boy2_10ChildListWeight(weight)
        references["2.11"] = Boy2_11ChildListWeight(weight)
        references["3.0"] = Boy3_0ChildListWeight(weight)
        references["3.1"] = Boy3_1ChildListWeight(weight)
        references["3.2"] = Boy3_2ChildListWeight(weight)
        references["3.3"] = Boy3_3ChildListWeight(weight)
        references["3.4"] = Boy3_4ChildListWeight(weight)
        references["3.5"] = Boy3_5ChildListWeight(weight)
        references["3.6"] = Boy3_6ChildListWeight(weight)
        references["3.7"] = Boy3_7ChildListWeight(weight)
        references["3.8"] = Boy3_8ChildListWeight(weight)
        references["3.9"] = Boy3_9ChildListWeight(weight)
        references["3.10"] = Boy3_10ChildListWeight(weight)
        references["3.11"] = Boy3_11ChildListWeight(weight)
        references["4.0"] = Boy4_0ChildListWeight(weight)
        references["4.1"] = Boy4_1ChildListWeight(weight)
        references["4.2"] = Boy4_2ChildListWeight(weight)
        references["4.3"] = Boy4_3ChildListWeight(weight)
        references["4.4"] = Boy4_4ChildListWeight(weight)
        references["4.5"] = Boy4_5ChildListWeight(weight)
        references["4.6"] = Boy4_6ChildListWeight(weight)
        references["4.7"] = Boy4_7ChildListWeight(weight)
        references["4.8"] = Boy4_8ChildListWeight(weight)
        references["4.9"] = Boy4_9ChildListWeight(weight)
        references["4.10"] = Boy4_10ChildListWeight(weight)
        references["4.11"] = Boy4_11ChildListWeight(weight)
        references["5.0"] = Boy5_0ChildListWeight(weight)
    }

}