package com.kel7.jadwalsholat.networking;

public interface APIBanghasan {
    String baseUrl = "https://api.banghasan.com/";
    String allCity = baseUrl + "sholat/format/json/kota";
    String shalatSchedule = baseUrl + "sholat/format/json/jadwal/kota/{0}/tanggal/{1}";
}
