package com.example.sim.ui.marketTracker.state

import com.example.sim.api.market.response.MarketResponse
import com.example.sim.models.Profit
import com.example.sim.models.Resource

data class MarketTrackerViewState(
    var marketTrackerFields: MarketTrackerFields = MarketTrackerFields(),
    var marketPriceFields: MarketPriceFields = MarketPriceFields()
) {
    data class MarketTrackerFields(
        var resourceList: List<Resource>? = null
    )

    data class MarketPriceFields(
        var marketOrderList: List<MarketResponse>? = null,
        var resource: Resource? = null,
        var resourceId: Int? = null,
        var profits: List<Profit>? = null
    )
}