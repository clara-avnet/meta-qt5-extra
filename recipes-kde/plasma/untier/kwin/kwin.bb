SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma distro_features_check

DEPENDS += " \
    libinput \
    \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kcrash \
    kglobalaccel \
    ki18n \
    kinit \
    knotifications \
    kservice \
    plasma-framework \
    kwidgetsaddons \
    kwindowsystem \
    kcompletion \
    kdeclarative \
    kcmutils \
    kio \
    knewstuff \
    kxmlgui \
    kdecoration \
"

# this condition matches always currently - it is kept in this way as a marker
DEPENDS += " \
	${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras libepoxy xcb-util-cursor", "",d)} \
"

# REVISIT: PACKAGECONFIG for optionals
DEPENDS += " \
	kwayland \
	kactivities \
	kdoctools \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "38b4a6d540ec6bbe94c0ec658c47eb5c"
SRC_URI[sha256sum] = "81f0caced49288f38ef1b34f70d4f62f4f261bdf57f6875631ec1017cfd6c7d3"

SRC_URI += " \
    file://0001-fix-build-for-qtbase-without-session-management.patch \
    file://0002-add-egl-flags-for-compiling.patch \
    file://0003-eglonxbackend-add-debug-output.patch \
"

FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kservices5 \
    ${datadir}/kwincompositing \
    ${datadir}/dbus-1 \
    ${datadir}/icons \
    ${datadir}/*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML} \
    ${libdir}/kconf_update_bin \
"

# taken from bitbake.conf with lucky modification: all lt libraries end with s.so
# only move them to -dev package
FILES_SOLIBSDEV = "${base_libdir}/lib*${SOLIBSDEV} ${libdir}/lib*s${SOLIBSDEV}"
FILES_${PN} += " \
    ${libdir}/*.so \
"


FILES_${PN}-dbg += " \
    ${libdir}/*/.debug \
    ${libdir}/*/*/.debug \
    ${libdir}/*/*/*/.debug \
    ${libdir}/*/*/*/*/.debug \
    ${libdir}/*/*/*/*/*/.debug \
    ${libdir}/*/*/*/*/*/*/.debug \
    ${libdir}/*/*/*/*/*/*/*/.debug \
"
