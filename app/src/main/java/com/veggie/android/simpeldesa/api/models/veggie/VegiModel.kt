
package com.veggie.android.simpeldesa.api.models.veggie

import com.google.gson.annotations.SerializedName

data class VegiModel(

	@SerializedName("records")
	val records: List<RecordsItem?>? = null,

	@SerializedName("source")
	val source: String? = null,

	@SerializedName("title")
	val title: String? = null,

	@SerializedName("external_ws_url")
	val externalWsUrl: String? = null,

	@SerializedName("total")
	val total: Int? = null,

	@SerializedName("external_ws")
	val externalWs: Int? = null,

	@SerializedName("limit")
	val limit: String? = null,

	@SerializedName("index_name")
	val indexName: String? = null,

	@SerializedName("sector")
	val sector: List<String?>? = null,

	@SerializedName("offset")
	val offset: String? = null,

	@SerializedName("org")
	val org: List<String?>? = null,

	@SerializedName("created")
	val created: Int? = null,

	@SerializedName("org_type")
	val orgType: String? = null,

	@SerializedName("count")
	val count: Int? = null,

	@SerializedName("active")
	val active: String? = null,

	@SerializedName("message")
	val message: String? = null,

	@SerializedName("version")
	val version: String? = null,

	@SerializedName("visualizable")
	val visualizable: String? = null,

	@SerializedName("field")
	val field: List<FieldItem?>? = null,

	@SerializedName("catalog_uuid")
	val catalogUuid: String? = null,

	@SerializedName("created_date")
	val createdDate: String? = null,

	@SerializedName("updated_date")
	val updatedDate: String? = null,

	@SerializedName("updated")
	val updated: Int? = null,

	@SerializedName("target_bucket")
	val targetBucket: TargetBucket? = null,

	@SerializedName("desc")
	val desc: String? = null,

	@SerializedName("status")
	val status: String? = null
)

data class FieldItem(

	@SerializedName("name")
	val name: String? = null,

	@SerializedName("id")
	val id: String? = null,

	@SerializedName("type")
	val type: String? = null
)

data class TargetBucket(

	@SerializedName("field")
	val field: String? = null,

	@SerializedName("index")
	val index: String? = null,

	@SerializedName("type")
	val type: String? = null
)

data class RecordsItem(

	@SerializedName("market")
	val market: String? = null,

	@SerializedName("commodity")
	val commodity: String? = null,

	@SerializedName("max_price")
	val maxPrice: String? = null,

	@SerializedName("min_price")
	val minPrice: String? = null,

	@SerializedName("variety")
	val variety: String? = null,

	@SerializedName("modal_price")
	val modalPrice: String? = null,

	@SerializedName("district")
	val district: String? = null,

	@SerializedName("state")
	val state: String? = null,

	@SerializedName("arrival_date")
	val arrivalDate: String? = null
)
