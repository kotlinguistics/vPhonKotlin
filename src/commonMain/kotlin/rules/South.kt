﻿package rules
object South: RuleSet {
	override val onsets = mapOf(
		"b" to "b", "t" to "t", "th" to "tʰ", "đ" to "d", "ch" to "c",
		"kh" to "x", "g" to "ɣ", "l" to "l", "m" to "m", "n" to "n",
		"ngh" to "ŋ", "nh" to "ɲ", "ng" to "ŋ", "ph" to "f", "v" to "j",
		"x" to "s", "d" to "j", "h" to "h", "p" to "p", "qu" to "w",
		"gi" to "j", "tr" to "ʈ", "k" to "k", "c" to "k", "gh" to "ɣ",
		"r" to "ʐ", "s" to "ʂ", "gi" to "j"
	)


	override val nuclei = mapOf(
		"a" to "a",
		"á" to "a",
		"à" to "a",
		"ả" to "a",
		"ã" to "a",
		"ạ" to "a",
		"â" to "ɤ̆",
		"ấ" to "ɤ̆",
		"ầ" to "ɤ̆",
		"ẩ" to "ɤ̆",
		"ẫ" to "ɤ̆",
		"ậ" to "ɤ̆",
		"ă" to "ă",
		"ắ" to "ă",
		"ằ" to "ă",
		"ẳ" to "ă",
		"ẵ" to "ă",
		"ặ" to "ă",
		"e" to "ɛ",
		"é" to "ɛ",
		"è" to "ɛ",
		"ẻ" to "ɛ",
		"ẽ" to "ɛ",
		"ẹ" to "ɛ",
		"ê" to "e",
		"ế" to "e",
		"ề" to "e",
		"ể" to "e",
		"ễ" to "e",
		"ệ" to "e",
		"i" to "i",
		"í" to "i",
		"ì" to "i",
		"ỉ" to "i",
		"ĩ" to "i",
		"ị" to "i",
		"o" to "ɔ",
		"ó" to "ɔ",
		"ò" to "ɔ",
		"ỏ" to "ɔ",
		"õ" to "ɔ",
		"ọ" to "ɔ",
		"ô" to "o",
		"ố" to "o",
		"ồ" to "o",
		"ổ" to "o",
		"ỗ" to "o",
		"ộ" to "o",
		"ơ" to "ɤ",
		"ớ" to "ɤ",
		"ờ" to "ɤ",
		"ở" to "ɤ",
		"ỡ" to "ɤ",
		"ợ" to "ɤ",
		"u" to "u",
		"ú" to "u",
		"ù" to "u",
		"ủ" to "u",
		"ũ" to "u",
		"ụ" to "u",
		"ư" to "ɯ",
		"ứ" to "ɯ",
		"ừ" to "ɯ",
		"ử" to "ɯ",
		"ữ" to "ɯ",
		"ự" to "ɯ",
		"y" to "i",
		"ý" to "i",
		"ỳ" to "i",
		"ỷ" to "i",
		"ỹ" to "i",
		"ỵ" to "i",

		"eo" to "eo",
		"éo" to "eo",
		"èo" to "eo",
		"ẻo" to "eo",
		"ẽo" to "eo",
		"ẹo" to "eo",
		"êu" to "ɛu",
		"ếu" to "ɛu",
		"ều" to "ɛu",
		"ểu" to "ɛu",
		"ễu" to "ɛu",
		"ệu" to "ɛu",
		"ia" to "iə",
		"ía" to "iə",
		"ìa" to "iə",
		"ỉa" to "iə",
		"ĩa" to "iə",
		"ịa" to "iə",
		"ia" to "iə",
		"iá" to "iə",
		"ià" to "iə",
		"iả" to "iə",
		"iã" to "iə",
		"iạ" to "iə",
		"iê" to "iə",
		"iế" to "iə",
		"iề" to "iə",
		"iể" to "iə",
		"iễ" to "iə",
		"iệ" to "iə",
		"oo" to "ɔ",
		"óo" to "ɔ",
		"òo" to "ɔ",
		"ỏo" to "ɔ",
		"õo" to "ɔ",
		"ọo" to "ɔ",
		"oo" to "ɔ",
		"oó" to "ɔ",
		"oò" to "ɔ",
		"oỏ" to "ɔ",
		"oõ" to "ɔ",
		"oọ" to "ɔ",
		"ôô" to "o",
		"ốô" to "o",
		"ồô" to "o",
		"ổô" to "o",
		"ỗô" to "o",
		"ộô" to "o",
		"ôô" to "o",
		"ôố" to "o",
		"ôồ" to "o",
		"ôổ" to "o",
		"ôỗ" to "o",
		"ôộ" to "o",
		"ua" to "uə",
		"úa" to "uə",
		"ùa" to "uə",
		"ủa" to "uə",
		"ũa" to "uə",
		"ụa" to "uə",
		"uô" to "uə",
		"uố" to "uə",
		"uồ" to "uə",
		"uổ" to "uə",
		"uỗ" to "uə",
		"uộ" to "uə",
		"ưa" to "ɯə",
		"ứa" to "ɯə",
		"ừa" to "ɯə",
		"ửa" to "ɯə",
		"ữa" to "ɯə",
		"ựa" to "ɯə",
		"ươ" to "ɯə",
		"ướ" to "ɯə",
		"ườ" to "ɯə",
		"ưở" to "ɯə",
		"ưỡ" to "ɯə",
		"ượ" to "ɯə",
		"yê" to "iɛ",
		"yế" to "iɛ",
		"yề" to "iɛ",
		"yể" to "iɛ",
		"yễ" to "iɛ",
		"yệ" to "iɛ",
		"uơ" to "uə",
		"uở" to "uə",
		"uờ" to "uə",
		"uở" to "uə",
		"uỡ" to "uə",
		"uợ" to "uə"
		)


	override val offglides = mapOf(
		"ai" to "aj", "ái" to "aj", "ài" to "aj", "ải" to "aj", "ãi" to "aj", "ại" to "aj",
		"ay" to "ăj", "áy" to "ăj", "ày" to "ăj", "ảy" to "ăj", "ãy" to "ăj", "ạy" to "ăj",
		"ao" to "aw", "áo" to "aw", "ào" to "aw", "ảo" to "aw", "ão" to "aw", "ạo" to "aw",
		"au" to "ăw", "áu" to "ăw", "àu" to "ăw", "ảu" to "ăw", "ãu" to "ăw", "ạu" to "ăw",
		"ây" to "ɤ̆j", "ấy" to "ɤ̆j", "ầy" to "ɤ̆j", "ẩy" to "ɤ̆j", "ẫy" to "ɤ̆j", "ậy" to "ɤ̆j",
		"âu" to "ɤ̆w", "ấu" to "ɤ̆w", "ầu" to "ɤ̆w", "ẩu" to "ɤ̆w", "ẫu" to "ɤ̆w", "ậu" to "ɤ̆w",
		"eo" to "ew", "éo" to "ew", "èo" to "ew", "ẻo" to "ew", "ẽo" to "ew", "ẹo" to "ew",
		"iu" to "iw", "íu" to "iw", "ìu" to "iw", "ỉu" to "iw", "ĩu" to "iw", "ịu" to "iw",
		"oi" to "ɔj", "ói" to "ɔj", "òi" to "ɔj", "ỏi" to "ɔj", "õi" to "ɔj", "ọi" to "ɔj",
		"ôi" to "oj", "ối" to "oj", "ồi" to "oj", "ổi" to "oj", "ỗi" to "oj", "ội" to "oj",
		"ui" to "uj", "úi" to "uj", "ùi" to "uj", "ủi" to "uj", "ũi" to "uj", "ụi" to "uj",
		"uy" to "uj", "úy" to "uj", "ùy" to "uj", "ủy" to "uj", "ũy" to "uj", "ụy" to "uj",
		"ơi" to "ɤj", "ới" to "ɤj", "ời" to "ɤj", "ởi" to "ɤj", "ỡi" to "ɤj", "ợi" to "ɤj",
		"ưi" to "ɯj", "ứi" to "ɯj", "ừi" to "ɯj", "ửi" to "ɯj", "ữi" to "ɯj", "ựi" to "ɯj",
		"ưu" to "ɯw", "ứu" to "ɯw", "ừu" to "ɯw", "ửu" to "ɯw", "ữu" to "ɯw", "ựu" to "ɯw",

		"iêu" to "iəw", "iếu" to "iəw", "iều" to "iəw", "iểu" to "iəw", "iễu" to "iəw", "iệu" to "iəw",
		"yêu" to "iəw", "yếu" to "iəw", "yều" to "iəw", "yểu" to "iəw", "yễu" to "iəw", "yệu" to "iəw",
		"uôi" to "uəj", "uối" to "uəj", "uồi" to "uəj", "uổi" to "uəj", "uỗi" to "uəj", "uội" to "uəj",
		"ươi" to "ɯəj", "ưới" to "ɯəj", "ười" to "ɯəj", "ưởi" to "ɯəj", "ưỡi" to "ɯəj", "ượi" to "ɯəj",
		"ươu" to "ɯəw", "ướu" to "ɯəw", "ườu" to "ɯəw", "ưởu" to "ɯəw", "ưỡu" to "ɯəw", "ượu" to "ɯəw"

	)

	override val onglides = mapOf(
		"oa" to "a", "oá" to "a", "oà" to "a", "oả" to "a", "oã" to "a", "oạ" to "a",
		"óa" to "a", "òa" to "a", "ỏa" to "a", "õa" to "a", "ọa" to "a",
		"oă" to "ă", "oắ" to "ă", "oằ" to "ă", "oẳ" to "ă", "oẵ" to "ă", "oặ" to "ă",
		"oe" to "e", "oé" to "e", "oè" to "e", "oẻ" to "e", "oẽ" to "e", "oẹ" to "e",
		"oe" to "e", "óe" to "e", "òe" to "e", "ỏe" to "e", "õe" to "e", "ọe" to "e",
		"ua" to "a", "uá" to "a", "uà" to "a", "uả" to "a", "uã" to "a", "uạ" to "a",
		"uă" to "ă", "uắ" to "ă", "uằ" to "ă", "uẳ" to "ă", "uẵ" to "ă", "uặ" to "ă",
		"uâ" to "ɤ̆", "uấ" to "ɤ̆", "uầ" to "ɤ̆", "uẩ" to "ɤ̆", "uẫ" to "ɤ̆", "uậ" to "ɤ̆",
		"ue" to "ɛ", "ué" to "ɛ", "uè" to "ɛ", "uẻ" to "ɛ", "uẽ" to "ɛ", "uẹ" to "ɛ",
		"uê" to "e", "uế" to "e", "uề" to "e", "uể" to "e", "uễ" to "e", "uệ" to "e",
		"uơ" to "ɤ", "uớ" to "ɤ", "uờ" to "ɤ", "uở" to "ɤ", "uỡ" to "ɤ", "uợ" to "ɤ",
		"uy" to "i", "uý" to "i", "uỳ" to "i", "uỷ" to "i", "uỹ" to "i", "uỵ" to "i",
		"uya" to "iə", "uyá" to "iə", "uyà" to "iə", "uyả" to "iə", "uyã" to "iə", "uyạ" to "iə",
		"uyê" to "iə", "uyế" to "iə", "uyề" to "iə", "uyể" to "iə", "uyễ" to "iə", "uyệ" to "iə",
		"uyu" to "iu", "uyú" to "iu", "uyù" to "iu", "uyủ" to "iu", "uyũ" to "iu", "uyụ" to "iu",
		"uyu" to "iu", "uýu" to "iu", "uỳu" to "iu", "uỷu" to "iu", "uỹu" to "iu", "uỵu" to "iu",
		"oen" to "en", "oén" to "en", "oèn" to "en", "oẻn" to "en", "oẽn" to "en", "oẹn" to "en",
		"oet" to "et", "oét" to "et", "oèt" to "et", "oẻt" to "et", "oẽt" to "et", "oẹt" to "et"

	)

	override val onoffglides = mapOf(
		"oe" to "ej", "oé" to "ej", "oè" to "ej", "oẻ" to "ej", "oẽ" to "ej", "oẹ" to "ej",
		"oai" to "aj", "oái" to "aj", "oài" to "aj", "oải" to "aj", "oãi" to "aj", "oại" to "aj",
		"oay" to "ăj", "oáy" to "ăj", "oày" to "ăj", "oảy" to "ăj", "oãy" to "ăj", "oạy" to "ăj",
		"oao" to "aw", "oáo" to "aw", "oào" to "aw", "oảo" to "aw", "oão" to "aw", "oạo" to "aw",
		"oeo" to "ew", "oéo" to "ew", "oèo" to "ew", "oẻo" to "ew", "oẽo" to "ew", "oẹo" to "ew",
		"oeo" to "ew", "óeo" to "ew", "òeo" to "ew", "ỏeo" to "ew", "õeo" to "ew", "ọeo" to "ew",
		"ueo" to "ew", "uéo" to "ew", "uèo" to "ew", "uẻo" to "ew", "uẽo" to "ew", "uẹo" to "ew",
		"uai" to "aj", "uái" to "aj", "uài" to "aj", "uải" to "aj", "uãi" to "aj", "uại" to "aj",
		"uay" to "ăj", "uáy" to "ăj", "uày" to "ăj", "uảy" to "ăj", "uãy" to "ăj", "uạy" to "ăj",
		"uây" to "ɤ̆j", "uấy" to "ɤ̆j", "uầy" to "ɤ̆j", "uẩy" to "ɤ̆j", "uẫy" to "ɤ̆j", "uậy" to "ɤ̆j"

	)

	override val codas = mapOf(
		"p" to "p", "t" to "t", "c" to "k", "m" to "m", "n" to "ŋ", "ng" to "ŋ", "nh" to "n", "ch" to "t"
	)

	override val tones = mapOf(
		"á" to "45", "à" to "32", "ả" to "214", "ã" to "214", "ạ" to "212",
		"ấ" to "45", "ầ" to "32", "ẩ" to "214", "ẫ" to "214", "ậ" to "212",
		"ắ" to "45", "ằ" to "32", "ẳ" to "214", "ẵ" to "214", "ặ" to "212",
		"é" to "45", "è" to "32", "ẻ" to "214", "ẽ" to "214", "ẹ" to "212",
		"ế" to "45", "ề" to "32", "ể" to "214", "ễ" to "214", "ệ" to "212",
		"í" to "45", "ì" to "32", "ỉ" to "214", "ĩ" to "214", "ị" to "212",
		"ó" to "45", "ò" to "32", "ỏ" to "214", "õ" to "214", "ọ" to "212",
		"ố" to "45", "ồ" to "32", "ổ" to "214", "ỗ" to "214", "ộ" to "212",
		"ớ" to "45", "ờ" to "32", "ở" to "214", "ỡ" to "214", "ợ" to "212",
		"ú" to "45", "ù" to "32", "ủ" to "214", "ũ" to "214", "ụ" to "212",
		"ứ" to "45", "ừ" to "32", "ử" to "214", "ữ" to "214", "ự" to "212",
		"ý" to "45", "ỳ" to "32", "ỷ" to "214", "ỹ" to "214", "ỵ" to "212"

		)

	override val tones_p = mapOf(
		"á" to "5", "à" to "2", "ả" to "4", "ã" to "4", "ạ" to "6",
		"ấ" to "5", "ầ" to "2", "ẩ" to "4", "ẫ" to "4", "ậ" to "6",
		"ắ" to "5", "ằ" to "2", "ẳ" to "4", "ẵ" to "4", "ặ" to "6",
		"é" to "5", "è" to "2", "ẻ" to "4", "ẽ" to "4", "ẹ" to "6",
		"ế" to "5", "ề" to "2", "ể" to "4", "ễ" to "4", "ệ" to "6",
		"í" to "5", "ì" to "2", "ỉ" to "4", "ĩ" to "4", "ị" to "6",
		"ó" to "5", "ò" to "2", "ỏ" to "4", "õ" to "4", "ọ" to "6",
		"ố" to "5", "ồ" to "2", "ổ" to "4", "ỗ" to "4", "ộ" to "6",
		"ớ" to "5", "ờ" to "2", "ở" to "4", "ỡ" to "4", "ợ" to "6",
		"ú" to "5", "ù" to "2", "ủ" to "4", "ũ" to "4", "ụ" to "6",
		"ứ" to "5", "ừ" to "2", "ử" to "4", "ữ" to "4", "ự" to "6",
		"ý" to "5", "ỳ" to "2", "ỷ" to "4", "ỹ" to "4", "ỵ" to "6"
		)


	override val gi = mapOf(
		"gi" to "ji", "gí" to "ji", "gì" to "ji", "gì" to "ji", "gĩ" to "ji", "gị" to "ji"
	)

	override val qu = mapOf(
		"quy" to "wi", "qúy" to "wi", "qùy" to "wi", "qủy" to "wi", "qũy" to "wi", "qụy" to "wi"
	)
}