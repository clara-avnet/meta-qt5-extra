SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-plasma cmake-lib

DEPENDS += "wayland wayland-native"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "6a40b0d2e43b5338156ae35bdecb8bfa"
SRC_URI[sha256sum] = "df5240a9fdaa531e27b0b831fc30a546a4c670f0fab13eed0dcb090fef27bb4a"
SRC_URI += "file://0001-do-not-perform-runtime-tests.patch"

CMAKE_ALIGN_SYSROOT[1] = "KF5Wayland, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Wayland, -S${includedir}, -S${STAGING_INCDIR}"


