package com.example.android.roomwordssample

import androidx.room.Entity
import androidx.room.Fts4
import androidx.room.FtsOptions

@Entity(tableName = "word_fts")
@Fts4(tokenizer = FtsOptions.TOKENIZER_UNICODE61)
class WorldFts(
    var word: String
)