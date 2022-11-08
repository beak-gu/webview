package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.RelativeLayout;
import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;

public class maplayout extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_map);

        MapView mapView = new MapView(this);

        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);
        mapView.setMapCenterPoint(MapPoint.mapPointWithGeoCoord(37.6644, 126.7417), true);
        mapView.zoomIn(true);
        mapView.zoomOut(true);


        //제2전시장 동남쪽GS25
        MapPOIItem marker1 = new MapPOIItem();
        //맵 포인트 위도경도 설정
        MapPoint mapPoint = MapPoint.mapPointWithGeoCoord(37.6636, 126.7446);
        marker1.setItemName("제2전시장 동남쪽GS25");
        marker1.setTag(0);
        marker1.setMapPoint(mapPoint);
        marker1.setMarkerType(MapPOIItem.MarkerType.BluePin); // 기본으로 제공하는 BluePin 마커 모양.
        marker1.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin); // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.
        mapView.addPOIItem(marker1);

        //7홀 이마트24
        MapPOIItem marker0 = new MapPOIItem();
        //맵 포인트 위도경도 설정
        MapPoint mapPoint0 = MapPoint.mapPointWithGeoCoord(37.6645, 126.7451);
        marker0.setItemName("7홀 이마트24");
        marker0.setTag(0);
        marker0.setMapPoint(mapPoint0);
        marker0.setMarkerType(MapPOIItem.MarkerType.BluePin); // 기본으로 제공하는 BluePin 마커 모양.
        marker0.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin); // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.
        mapView.addPOIItem(marker0);

        //온누리공원 CU
        MapPOIItem marker2 = new MapPOIItem();
        //맵 포인트 위도경도 설정
        MapPoint mapPoint2 = MapPoint.mapPointWithGeoCoord(37.6644, 126.7465);
        marker2.setItemName("온누리공원 CU");
        marker2.setTag(0);
        marker2.setMapPoint(mapPoint2);
        marker2.setMarkerType(MapPOIItem.MarkerType.BluePin); // 기본으로 제공하는 BluePin 마커 모양.
        marker2.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin); // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.
        mapView.addPOIItem(marker2);


        //제 1전시장 GS25
        MapPOIItem marker3 = new MapPOIItem();
        //맵 포인트 위도경도 설정
        MapPoint mapPoint3 = MapPoint.mapPointWithGeoCoord(37.6685, 126.7458);
        marker3.setItemName("제 1전시장 GS25");
        marker3.setTag(0);
        marker3.setMapPoint(mapPoint3);
        marker3.setMarkerType(MapPOIItem.MarkerType.BluePin); // 기본으로 제공하는 BluePin 마커 모양.
        marker3.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin); // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.
        mapView.addPOIItem(marker3);


        //1전시장 북쪽 CU
        MapPOIItem marker4 = new MapPOIItem();
        //맵 포인트 위도경도 설정
        MapPoint mapPoint4 = MapPoint.mapPointWithGeoCoord(37.6719, 126.7458);
        marker4.setItemName("1전시장 북쪽 CU");
        marker4.setTag(0);
        marker4.setMapPoint(mapPoint4);
        marker4.setMarkerType(MapPOIItem.MarkerType.BluePin); // 기본으로 제공하는 BluePin 마커 모양.
        marker4.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin); // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.
        mapView.addPOIItem(marker4);


        //E2 FESTA
        MapPOIItem marker5 = new MapPOIItem();
        //맵 포인트 위도경도 설정
        MapPoint mapPoint5 = MapPoint.mapPointWithGeoCoord(37.6645, 126.7417);
        marker5.setItemName("E2 FESTA 편의점");
        marker5.setTag(0);
        marker5.setMapPoint(mapPoint5);
        marker5.setMarkerType(MapPOIItem.MarkerType.BluePin); // 기본으로 제공하는 BluePin 마커 모양.
        marker5.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin); // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.
        mapView.addPOIItem(marker5);
    }

}