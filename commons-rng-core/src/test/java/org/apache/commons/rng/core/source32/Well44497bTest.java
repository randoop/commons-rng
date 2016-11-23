/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.rng.core.source32;

import org.apache.commons.rng.RandomAssert;
import org.junit.Test;

public class Well44497bTest {
    @Test
    public void testReferenceCode() {
        final int[] base = {
            0x2c2878c6, 0x47af36c4, 0xf422e677, 0xf08fd8d3, 0xee9a47c7, 0xba983942, 0xa2a9f9a5, 0x1d443748,
            0x8fc260b2, 0x5275c681, 0x4a2f5a28, 0x2911683d, 0xa204c27e, 0xb20a6a26, 0x54ba33be, 0x67d63eb0,
            0xdc8174cf, 0x3e73a4bc, 0x6fce0775, 0x9e6141fc, 0x5232218a, 0x0fa9e601, 0x0b6fdb4a, 0xf10a0a8c,
            0x97829dba, 0xc60b0778, 0x0566db41, 0x620807aa, 0x599b89c9, 0x1a34942b, 0x6baae3da, 0x4ba0b73d
        };
        final int[] seed = new int[1391];
        for (int i = 0; i < seed.length; ++i) {
            seed[i] = base[i % base.length] + i;
        }

        final Well44497b rng = new Well44497b(seed);

        final int[] expectedSequence = {
            0xf9eb8c4a, 0xb5388f7f, 0x31db15ce, 0x7436250c, 0x26ebff2e, 0x5e23be0e, 0x29b3d9da, 0xf79c8147,
            0x4565a1d2, 0x1907aeb2, 0x15d9658f, 0x2e86830d, 0x6f4e5a56, 0xeb1ae997, 0xc6852d4e, 0xb11d1a69,
            0x0b6a1884, 0x17c35178, 0x5d84b05f, 0x3be7e73f, 0x0bdd5123, 0x01da4da8, 0x0473cc3c, 0xafe51580,
            0xb8238478, 0x9e5eb067, 0x1590d61b, 0x9a4f09cd, 0xe7f58193, 0x63509a7e, 0x86b4ef58, 0x49bcb046,
            0x92bad8e9, 0x5e6dd096, 0x4d3a3ab1, 0x9776638f, 0x4802d849, 0x3772ee29, 0xd444615a, 0x0b7d2c7f,
            0x64e0efd4, 0x66f41964, 0x7e89b0e3, 0xcfc74119, 0xc4de0b6c, 0xca9f2618, 0xe700e201, 0x9298d076,
            0x7c8d36eb, 0x6224fb16, 0xb4d563bb, 0xc411da30, 0x60898d17, 0xaa4e15d2, 0x608a7efa, 0x4ea45741,
            0x93b35791, 0xf70be8d4, 0xe164e214, 0x711e5ef4, 0x9104bb18, 0x96b6324c, 0x79465ac2, 0x22e86d22,
            0x6f48696f, 0x298a7eb4, 0xa46ee147, 0xe095c5a9, 0xa3538ee4, 0xc094c30a, 0x3d1532b7, 0x6a38643c,
            0x8fb03976, 0x07b0d0b0, 0x551c6bd0, 0xbb33f741, 0xad8edb14, 0xa1cafba2, 0x8e54bb70, 0xf9c8855f,
            0x95d96c98, 0x8360b095, 0x9551aca2, 0xa5509bf7, 0x491cd2e9, 0x431ec7b4, 0x81cfb46e, 0xe534073b,
            0xf2f2964f, 0xd68aae52, 0x0224244e, 0x529e9de9, 0xfa55eff7, 0xf5f27f81, 0x1a071e01, 0xbc2cc04c,
            0x8619bb1b, 0xc2de2157, 0x07efa053, 0x03d40321, 0x8ac2d84e, 0x29c590ab, 0x1481ec1e, 0xc9b8a4ef,
            0xf3511719, 0x2c21029b, 0xb45c2897, 0x5a773c5f, 0xd86970ae, 0xd73f48b8, 0xfbb61984, 0x052929af,
            0xb6592e9c, 0xaaf1e6ff, 0xf611e92f, 0x0cc447d8, 0xaa599d24, 0x0defe09b, 0x2a5fe45c, 0x8c64d61f,
            0xe627ad10, 0xbfde76f6, 0xa3a16956, 0xb1de5a73, 0xd9d125a6, 0xd676b448, 0xb393c232, 0xdf6d844f,
            0xa5987910, 0xe15fe210, 0xe4ab6f8d, 0x2a415d07, 0xe39700e8, 0x8254c003, 0xffd43332, 0xa8f8643b,
            0x1a05cc23, 0xc77054a6, 0x70bc1814, 0x73e263e1, 0x3929b37c, 0xb47a85ba, 0x9af6d890, 0x6e7df50f,
            0x5f08fce8, 0x4bb42d77, 0x43ecb1ca, 0x6d85070b, 0xd5afa3e1, 0xe4babbfa, 0xcb1fa6df, 0xf197e418,
            0x8f73f5e5, 0xd333dd04, 0x42e4a2d2, 0x472ee369, 0x3895ef2c, 0x35377394, 0xd0d70ff6, 0xf6fcd325,
            0xccc8283d, 0x8a0a3f3e, 0x1349caaf, 0xc3148637, 0x9474a696, 0xe9011d75, 0x8130918e, 0xd50fdea1,
            0xb1919549, 0x3b9570cf, 0x13f85595, 0x98b73d48, 0x92b862dd, 0x1fee5d99, 0xb363077b, 0x47ed233a,
            0xbbf445ba, 0x2d49923d, 0xa0a97f5e, 0x8979923d, 0x3efb7cdf, 0xcd2ee58e, 0x3ef90ea9, 0x92d2a8d7,
            0x2cf3b42b, 0xb2721c9a, 0x370209be, 0xa66f20f9, 0xc7635366, 0xc1c7ce0a, 0xbc3ba48e, 0x9dac078d,
            0x500908c4, 0x64e31a83, 0xf81d9494, 0xbdf4ad5a, 0xff24f3a7, 0x9ff42f32, 0x6274df89, 0x344f1d7f,
            0x50d55f1f, 0xd2c0ab2b, 0xb27c189f, 0xe7448a8a, 0xf3fdab8b, 0x74bf8873, 0x5a335504, 0xacbdf5d4,
            0x50a09a94, 0x4419430d, 0x03283fde, 0xea3c5eab, 0x9f7f319d, 0xae6e21ca, 0x57a9ded1, 0xab4fd711,
            0xcdb2f6aa, 0x9be3cb21, 0x5646407f, 0x0dfaf9c8, 0xa6261b2d, 0xaa92936d, 0xd76a7170, 0xe25bb9c7,
            0x3348cc42, 0x0fb2cf79, 0x5b9dd48a, 0xdcb1655c, 0x5ea4b6bd, 0x68b468b5, 0x83f19147, 0xa3ca57e9,
            0x2b23e0db, 0xcb51fc89, 0x713ddc59, 0xf00045d0, 0x3f190d73, 0x634c3ff5, 0x9ed2f9fc, 0xdb5bd9bb,
            0x35205c55, 0x51988784, 0xba7d65af, 0x11a98540, 0x8e3a785a, 0x819d97d8, 0x4a3c82fd, 0x700a1b17,
            0x9a51500c, 0x3cb31e05, 0x99c703f1, 0xbeab2cf2, 0x97b2c682, 0x7f02c7db, 0x12fe2dc6, 0x210e67e7,
            0xe2d898e0, 0x94239d8f, 0x9acc05f8, 0xc7243c78, 0x87f56697, 0xf7203249, 0x6ca4cdfc, 0xa89a02c0,
            0x0876bf6a, 0x7405a170, 0x4edbf02e, 0x33858c05, 0x8058c835, 0x5a09f5f1, 0x5786229a, 0x4c1e1469,
            0xae748079, 0x0ac95262, 0x7f9acf59, 0xd6fcdb25, 0x30dbd3f8, 0xf6cc41ec, 0xb97d453d, 0x4aefb871,
            0x530181b8, 0x5150bdab, 0x9697d51f, 0x13488e54, 0xdee71ef4, 0x1c438318, 0xb9bb635f, 0x809ab956,
            0x6189ce01, 0x5362d94c, 0x4c183a61, 0x3c65f9a6, 0xc705d9d7, 0xa460f64d, 0xf5527572, 0x146fa8e2,
            0x45e668c7, 0x2be30c16, 0xbd8faf41, 0x92d055bb, 0x8fcd9081, 0xe599a689, 0xb81672a0, 0x939b5df5,
            0x01823c37, 0x7d2ffd8a, 0xa2da0e99, 0x690e6eaf, 0x918a8009, 0xbb4c867d, 0x87986510, 0xcfbee8ca,
            0x32945f83, 0xe0107f7d, 0x6c567265, 0x50185a20, 0xdc1aa2a4, 0x67b53d54, 0xce4d5c8e, 0x1ddff0d9,
            0xd47b7f07, 0x4895e595, 0xd75cf72d, 0xdb865d06, 0x3a5102ad, 0xa5974c1b, 0x3a12b2ec, 0xad2b6260,
            0x7ca3a3c3, 0xd4a2ca86, 0x7e1fff27, 0x1035696e, 0x248d560b, 0x82cdfbe0, 0x0b533ee3, 0x9ede15e6,
            0xaec3f979, 0x0a6fb9cf, 0xc94a5dbd, 0x884ba5eb, 0xe80ac741, 0x1e0dc4a8, 0x8ac934ef, 0x003ea808,
            0x09d41ade, 0x0d802909, 0x2717b5a9, 0xdb9c1232, 0x0b4a740e, 0x3ef0f592, 0x010c99d4, 0x233a50f1,
            0x433abb45, 0xa3d02843, 0x76dcb0ad, 0xd4d68be4, 0xd7d4ce74, 0x9cc21578, 0xdb8365d7, 0xd0ba35de,
            0x8e779d5a, 0x2d278682, 0x835a35ab, 0x8170a266, 0xa57a6f52, 0xd024df91, 0xf2b496df, 0xa60b2ebd,
            0x4742bda5, 0x7beefd43, 0xca1e835f, 0x95cbe131, 0x6d5f1f3f, 0xc6fc7b2e, 0xbb4d7869, 0xbd7a634a,
            0xeb35b0bc, 0xacd4f3bb, 0xfa87e05b, 0xfedc52eb, 0x72daa0ed, 0xc3743841, 0x2089d702, 0x606e8e8f,
            0x2abbfe91, 0x724477b7, 0xc5886d85, 0xf35343f1, 0x9e908621, 0x91425228, 0xa8d7b8bb, 0x4bebe2a2,
            0x3f335406, 0xea725ab8, 0x33bb9a4d, 0x1ae4f982, 0x182fb6b8, 0x45740c3f, 0x6fe4453d, 0x7d5afa9b,
            0x62027f3f, 0x4aaf3d89, 0x74ebb382, 0xa49eba50, 0x6ab830d8, 0xfdb8b73a, 0xb21ca957, 0x2a89d682,
            0xa47474a2, 0x522449ef, 0xebd7b2b4, 0x62357202, 0xe38a72c7, 0x0c20e4a5, 0x8bc912de, 0xe1ffda73,
            0xd9ee22f3, 0x1315a7c5, 0xaa6ec3ed, 0x36168979, 0xfb63343b, 0x20079960, 0xec0301a1, 0x8e08401c,
            0x20a70ea6, 0xf28e61fd, 0x40efc57e, 0x1ba0b289, 0xf1aff0ec, 0xfae15799, 0x7a610931, 0xeedeb38d,
            0x36f2c12b, 0xc85e0450, 0xb9beeb3d, 0xb86b10e6, 0xd7e9607f, 0x223cfd6e, 0x55ef1d97, 0x93d906f2,
            0x09e12b58, 0xf5749c13, 0xba3413c0, 0x8171be86, 0xaa68d02b, 0x5ee1c306, 0xcb38ad98, 0xd0be1b39,
            0x510e0cd6, 0x3de49e48, 0x872a8aac, 0x28f73c21, 0xf62276ee, 0x52eb3650, 0xad52d305, 0x2f5d9ae4,
            0xcfe34233, 0x27ce23a2, 0xdf7e17cd, 0xae42926a, 0xd6ee353a, 0x59b182a5, 0xd320ca21, 0x8d8e657f,
            0x8fa71adf, 0xeb1ac850, 0xf43faf71, 0xf52ad236, 0xd06923b3, 0xc968229c, 0x6abbc365, 0xea4dd803,
            0x72a06c99, 0xb0f053c2, 0x9f604a7d, 0x88f1781b, 0x6b2d1aef, 0x85a00592, 0xf6786d58, 0xb34d2f70,
            0x3e5f5a3b, 0x6d329107, 0xe8ceed25, 0x0445d819, 0xfb77f254, 0x7219738f, 0x6e846109, 0x33fc1282,
            0x963df7b0, 0xddb7aaeb, 0x8d902ab4, 0x7a47607d, 0xb9e4feaa, 0xcb55a7eb, 0xb550041a, 0xb1e23ab4,
            0x0ea1863a, 0x959dbdf8, 0xb153ba8b, 0x52188b39, 0x5151c6a1, 0xe7a3ecf3, 0x087bd5c2, 0x8ba1b86d,
            0x9a7c5b58, 0x12da9436, 0x7907d11f, 0x1d201142, 0x95b51a86, 0x7e2db64d, 0xe67816cc, 0xfd706251,
            0xe39d5dbe, 0xec9e4159, 0x9b3939c5, 0x32d49111, 0x019435be, 0x0514d509, 0xae0b88e6, 0xe9925cbf,
            0x3a91e3f0, 0x2378ceb0, 0x166f75de, 0x5dd91d58, 0xa6045910, 0x8ead5a6b, 0xfc7b70a0, 0x155f4b0b,
            0x145d6d8e, 0x0affe016, 0xdf29283a, 0x8eebe24c, 0x5f1d4441, 0xb6522f48, 0x780fbede, 0x86d0257a,
            0xd81391d7, 0x8d1b344c, 0x3c3e9a54, 0xdd5282a4, 0x72957a76, 0xa92bdb8e, 0x9e9dfad5, 0x13434ceb,
            0x77559a7d, 0x82e2c4f6, 0x1088b141, 0xd7f3713a, 0xe9158f33, 0x78e4e984, 0x15e5f429, 0x4bb3771d,
            0xf5b2af8a, 0xd93a5c5b, 0xce6bba17, 0xb5301cbf, 0xf7cdb8a1, 0x718195f6, 0xff826c4d, 0x2a297c6a,
            0xef7f745c, 0x03014f22, 0x58a31100, 0x5e0af435, 0x76e0e967, 0x49bfbefb, 0xdc1df615, 0x8e70ad1c,
            0x8f018598, 0x45ea3ca1, 0x2fc045e1, 0x938cdc71, 0xdcf40c48, 0x882beecb, 0x9defd645, 0xcd48cd6b,
            0x30b26934, 0x15518c13, 0x7494017a, 0x606f3a6d, 0xc3933ae6, 0x08bfb9bc, 0x35e4c708, 0xe2305d87,
            0x7c5384f6, 0x724dfe37, 0x934b386d, 0x76dcd82c, 0x2f0a2e22, 0x69501a2a, 0x698a8366, 0x037842a5,
            0x9ab1b83e, 0x14ac2a73, 0xb409d845, 0xffb27d8a, 0xf47d8921, 0x3cd07eeb, 0x94f4adca, 0x8bb54ada,
            0xfd63eeee, 0xe99fcc7f, 0x3d332142, 0xf3a55116, 0x51559641, 0x5e1a79ee, 0x1b499e0f, 0xe029b1f4,
            0xc13d6ddc, 0x8eec872a, 0x566ce2c4, 0x7a5b3e3a, 0xbbbe18c9, 0x57fe99a5, 0x16174c72, 0xec9d16fe,
            0x00210ce0, 0x613db062, 0x3d8833e3, 0xb2eeb7f1, 0x941af60f, 0x2b41b27c, 0xbab2ee06, 0x29e132ea,
            0x52b637b7, 0x3a857997, 0xded5e26c, 0xbdedd156, 0x95c6bf99, 0x5e503b89, 0x9788314c, 0x125008bb,
            0x52a41a1b, 0xafe9bd96, 0x73726042, 0xb4955c6d, 0xeb62cae3, 0x3753d613, 0x0e3f9e6e, 0x6ed38f3e,
            0xd86051e7, 0xceededcc, 0x14a97c3e, 0xcc489da0, 0x8e476def, 0x513545e9, 0x20413975, 0xf48336ca,
            0x624f564e, 0x0e95be63, 0xe2e6f6ce, 0x0cc181c0, 0x791fc5fd, 0x9bf2b807, 0xf03a9e64, 0x4e0604c6,
            0xd91c5f62, 0x6dfe0f81, 0xd609f698, 0xdf34d25a, 0xda6e9c24, 0x6a3cda5b, 0x62619c72, 0xbcc58c16,
            0xac13df0c, 0xbd46f663, 0xa2a918d7, 0x8df19d57, 0x20c5ea0c, 0xabf02aec, 0x8ae89c36, 0x0d9b8767,
            0xe6e7a58a, 0x72fba4fe, 0xf01754c8, 0x0fc8af4b, 0x884e7ad7, 0xbf22317c, 0x086b2f50, 0x6f89ab62,
            0x0dfc3b53, 0x66c4975e, 0x61a6084b, 0xce1181ec, 0xd8c89b63, 0x0a04e924, 0x2a3c75b3, 0x8fd8df23,
            0x941605fa, 0xf4777ee6, 0x70a6d765, 0x85c4c544, 0xd6a71110, 0xb581dd9e, 0x2ad7005b, 0xfb72fede,
            0xf4c80925, 0x36e400da, 0x93df5cbf, 0x78016978, 0x8bd6fa2f, 0xf42c8a69, 0xb58f3a48, 0x467fad55,
            0x49b7f13c, 0xb2a9e2ed, 0x8b442416, 0x55a70c3f, 0x1745f60d, 0x06bd4afc, 0x4a62b591, 0x7d578ccf,
            0xa2ce8114, 0xf85c377c, 0xd30d6c22, 0xa8e03cde, 0x383e6e98, 0xc39ab72f, 0x0d301120, 0x5a3ff16d,
            0x5f2f7939, 0x282fd388, 0x24bcdb5e, 0x6bf51773, 0x96d69519, 0x9d6e6cc3, 0x9a875e95, 0x1749467e,
            0xf3832e33, 0xaca7f67d, 0xf905c873, 0x60e8acdf, 0x27484685, 0xa7260b61, 0x32751fdc, 0x0c8f43f5,
            0x6e980de2, 0x66fb4d00, 0x40c62cf0, 0x421bb383, 0xc5458b4e, 0x93e3f361, 0xc719f6ea, 0xa54095b1,
            0x458153db, 0xf4904fdb, 0xc17ceb84, 0xd895cdee, 0x453a6f0d, 0x59f2e469, 0xc92dacaa, 0xf6bc4ee7,
            0x963e48ee, 0xea295409, 0x7c94fd24, 0xd6ab133d, 0x9b095054, 0x6e138ab6, 0x372f6fcd, 0x1c46846e,
            0x0c7364f7, 0x16c7d5dc, 0xef21ad3e, 0x831ec948, 0x2290ffb1, 0x52e5650e, 0x96bb2647, 0x35abe2a9,
            0xa65f4f3c, 0x3a1c98f2, 0xf99469c1, 0x16bac354, 0x46c41925, 0xccb4e29a, 0x1f3d2fc4, 0x5960a5d2,
            0x0bc9818c, 0xd0dd4e12, 0xe7bee0f9, 0x8a725071, 0xd851e6bd, 0xf93ea075, 0x3dd1b884, 0xb95797f7,
            0xd38fefb6, 0xdf708359, 0x768ca3c9, 0x8a41bafa, 0xba6e5b13, 0x2e5bf73c, 0xa2f6056b, 0xf7a3d268,
            0xb5e03268, 0xace6f72d, 0xd135cee2, 0x129658af, 0xc2e094a3, 0xdbeb15c1, 0xb5670b77, 0x200514fe,
            0x23a15e29, 0x91fbd460, 0xa33bfef7, 0xa720e8ab, 0x8c9bf361, 0x7cc84077, 0x71bde49c, 0xed336fa5,
            0x50d8723c, 0x8742e76a, 0x258edcfe, 0x1076555f, 0x1e67dd86, 0xb48827ad, 0xf5dbaf44, 0xf6f7ae93,
            0xe383d265, 0x71010d1f, 0x6f7b048c, 0xba44df93, 0x150ff25c, 0x7dd5fd05, 0x64ce5cda, 0x4e9ac4ea,
            0xfa938c36, 0x36ea114d, 0x070c38e1, 0x15e00e64, 0x60d96990, 0x77da2866, 0x3392c20f, 0x66638b0b,
            0xfb2fbc60, 0xd98eec37, 0x082a739c, 0xeba245a5, 0x8e4511c6, 0x8aa472c8, 0xeb5a638d, 0xf5051ff0,
            0xe17e60fb, 0x81bf3ce6, 0xbf3d78e1, 0x6b0273e7, 0xda1f2048, 0x18c753b4, 0x32b9e850, 0xca145661,
            0x8a72273b, 0xfc2a483e, 0x220b7838, 0x4a6f669b, 0xaf78e806, 0x1b4a9528, 0x6de25702, 0x66753fa6,
            0x30954419, 0x6c0f9729, 0x157fa568, 0xaf24216a, 0x62d00eb0, 0x69de8db1, 0xd11b8d5e, 0xeb999cb9,
            0xf1e4f30d, 0x2df4c02d, 0x36065d61, 0xeda369dd, 0x71b91ed6, 0x0c475138, 0xfd7cf108, 0x35ab11c6,
            0xc94f4d1d, 0xed7dd424, 0x99dc1d8a, 0x7ada7170, 0xe9788411, 0x351fe602, 0xcf0e0bea, 0x138f12e0,
            0x59a20fb8, 0x20e114d2, 0x83a5fd6d, 0x84964679, 0x056f879d, 0x9d6406d2, 0xc243f306, 0xebef97b3,
            0xb744e79d, 0xa878f194, 0x7d8150f9, 0xcdd9ac63, 0xf8afa3b6, 0x8802eeed, 0x1d78e048, 0x85861f4a,
            0xfbf338ed, 0x7217d0cf, 0x73be0e8d, 0xc2c57d37, 0xd2375e73, 0x18fb69f4, 0xef90628c, 0xf5c69d2f,
            0x05d3a40e, 0xfef2a92f, 0xa1f01211, 0x3b52f126, 0xa1613cbf, 0x294ce2e3, 0x38b8c303, 0x702e962d,
            0xa3d55a7c, 0x784e9d94, 0x9542e6c3, 0x5bedb6ea, 0xaa4f97c1, 0x1bfd5441, 0x9dc7c05e, 0xb16ca88c,
            0x1da31c16, 0x2b51129d, 0x64eb2a8c, 0x835b097a, 0xf38aa47c, 0x07888143, 0x3effe9d4, 0x8280b58b,
            0x2cf2277c, 0x05bfec4f, 0x04fd2d9f, 0x41a9f8b1, 0x5890501d, 0x210211fe, 0x712cedd9, 0xc01a192e,
            0x55b7163d, 0x76c3c069, 0x44adf8e8, 0x3cc2aee7, 0xf5833267, 0xff99e670, 0x3afefdf9, 0x39b7fdc7,
            0xb0b3d12e, 0x659fad47, 0xc47d1f6e, 0xc77dbfb8, 0x8d755ae9, 0xc5d5d968, 0x5114206b, 0xcbf9f825,
            0x00c16f2b, 0x8e4574bc, 0x34aad010, 0x03e99c4d, 0xf40eaaaa, 0x52a6a678, 0xb8418751, 0x6ffa84ef,
            0x19683f38, 0x12cc3e29, 0x7144a93d, 0x29f0f9fe, 0xd260d921, 0x3fc945a4, 0x536e7924, 0xd00fe6d6,
            0x9f79a06e, 0x504d078e, 0x0dbf371c, 0x4130cf4b, 0x00d5efe7, 0x82691f7f, 0xc6488723, 0x9bea125d,
            0x74cfeea1, 0x3f8526ad, 0x41017779, 0x4e2b1174, 0x339b99a2, 0x33db6686, 0x22386b7f, 0x6dd556c2,
            0xb32835c1, 0x8deaa768, 0x63afd4ad, 0xca558005, 0xa52895c8, 0x0822e208, 0x8e211f6c, 0xaaa60cc7,
            0xce819a50, 0xb18bdd0e, 0xd032d5b4, 0x5d05ecc6, 0xfb201016, 0x17f35371, 0xc76dd59e, 0x3842ba3f,
            0xd4ecfb1a, 0xfa3a8e0f, 0xbedbafe2, 0x0dbe2c5c, 0xfbce7480, 0xacab2838, 0xed58b6ca, 0x57f11fe5,
            0xdae58a71, 0x6303fb8c, 0xfedcfea6, 0x005bed8f, 0x57ccd4b9, 0x7a6bfefa, 0xafb9eff9, 0x587fb631,
            0xa3774fbe, 0x4cb84cd7, 0x60257bfb, 0x35cb0648, 0xa65374c1, 0x165e83f3, 0xce2643ac, 0x7a0beeeb,
            0x77d67d82, 0xe068e67c, 0x1f675f3d, 0x3a686024, 0x0585a72d, 0x4134dba8, 0x1f4c3309, 0xda8c596a,
            0xc10ce519, 0xe0c4e0a3, 0xbed995a2, 0x22066d03, 0x2931625e, 0x4bb234f0, 0x3d19ceac, 0x0015da4a,
            0x1dc87923, 0x0ce57832, 0x3c082de3, 0xedfe9112, 0xb64beb5c, 0xd50ba80c, 0x45ca2d3e, 0xee733644,
            0xb3abd4b0, 0x7d13f1da, 0xe5d14ce4, 0x039eefd8, 0xac2bd487, 0x812b73c3, 0xba59f28b, 0xf58b13c9,
            0x0390a480, 0x101958ca, 0x62d26619, 0x165d872e, 0x7bbae4f1, 0x88a601ca, 0xf39c7fcd, 0x825a5a01,
            0x0d226238, 0xb549bb78, 0x7ccd6f2e, 0x6d095996, 0xb0567749, 0x8530f16e, 0xffca3848, 0x3656b104,
            0x00339f0a, 0xaa8a55ef, 0x8b10e692, 0x04487622, 0x0e06c360, 0x9247d69c, 0xf8f8b2e6, 0x2a94b3de,
            0x7ea1a275, 0xdc42660e, 0x7088c61f, 0xe1bb5030, 0xb3916fe9, 0xca390927, 0xad2d2cf2, 0xaf641b4e,
            0xadf900e8, 0xb81d3550, 0xa47e02d5, 0xa65f55a6, 0xc2246bc8, 0x7984dcbb, 0x0868c0d5, 0x3b0ed447,
            0xd4b08144, 0x712227f1, 0xe72de165, 0x77de4665, 0x0af66b5d, 0x9dc3bea7, 0xc9b1f568, 0x06851474,
            0x6ba69abd, 0xfec47d33, 0xf9d69b1d, 0x8f369888, 0xd82b120b, 0x5680c0da, 0x073e0b4a, 0x3537e161,
            0xadcbb641, 0xb5c25b08, 0xe6cf800d, 0x89ff9a79, 0xc5eb328b, 0x7d1e4a36, 0x008969a4, 0x357b1e10,
            0x091a1eda, 0xea1b4ac8, 0xa13176e3, 0x98819356, 0x98f21f13, 0x9b554fb6, 0x2f094944, 0xde140250,
            0x7d53c489, 0xe141a8c3, 0x97492441, 0xca77cd47, 0xc4fe200a, 0x05a4fa66, 0xc1d27eea, 0xb48f22c2,
            0x716602bf, 0xeeeb1263, 0xb89b1694, 0xd2d6c684, 0x8e6114ab, 0xc6d231d9, 0x3b4a5203, 0x98915636,
            0xd44e1c45, 0x38a49a3c, 0x50ac1894, 0x1476ca37, 0x4ca7c83b, 0x4fac4b1e, 0x9696e488, 0x33d23dbe,
            0x8b6690fe, 0x477bd2e2, 0x9c5eeb6c, 0x61ff2b24, 0x70f0cc14, 0x6d1d4b90, 0xaaf09e21, 0x7aff0b07,
            0xb38073b6, 0x714f90ff, 0x4f7ee1ea, 0xa8155211, 0xf715104d, 0x86af21f0, 0x749095a4, 0x2a193902,
            0x5efe3247, 0xad12f051, 0xcc9e5acf, 0xe1da3419, 0xea960075, 0xa7266501, 0x497bf896, 0x88eb1358,
            0xbf98853c, 0x38ead5c5, 0x457cad5e, 0xc7a0e918, 0xf9d7df8c, 0x3c077988, 0x5ea2299b, 0xe361ade4,
            0x444c7598, 0xb9eb51cb, 0xc3ffc354, 0x4765840a, 0x8bf62084, 0xe86637f5, 0x12108084, 0x43c60680,
            0x79c00291, 0x8a3c1407, 0x12d92b08, 0xc460875a, 0x642df87c, 0x658eb66e, 0xa948dce5, 0x84f2de13,
            0xfafbf168, 0xf38a9a4b, 0xaa9dbfe1, 0xad52b4b5, 0x9098a4af, 0x8c3a41de, 0xb4e1790a, 0xf28f8fd8,
            0x79b6e6b7, 0xda7eee27, 0x1a9a9e0c, 0x6f6cfe42, 0x8c0fbbca, 0x70235c93, 0xe31bdd59, 0x5101b653,
            0xebd95907, 0x650adf02, 0x8a90d909, 0x8db9bade, 0x6021b521, 0xaef1ad35, 0xf1f4b33f, 0xce481c2e,
            0xe03a17ea, 0x494539e0, 0x2d194f27, 0x2d51e110, 0x4a0de34d, 0x283432a5, 0xaee91b11, 0x4fc5953d,
            0x7b0b50a7, 0xb3a844dc, 0x8eb874e8, 0xde6e3bb9, 0x6d245784, 0x9146b224, 0x8a15ef39, 0xedfda77b,
            0x191d73ab, 0x01aa3e59, 0xb0202c46, 0x72b4349f, 0x34f92274, 0x9d937103, 0xed9d2e95, 0xa4fee698,
            0xb225b25e, 0xcda478ac, 0x343858c2, 0x6e0614e1, 0xe7281c0b, 0xb22c9edb, 0xa8d2b08a, 0xe574adfd,
            0x73e6e316, 0xa7961ce5, 0x2f96a88a, 0x07a4922f, 0xd3a27aab, 0xc7bdbc9c, 0x93593d41, 0x31f2972c,
            0x6b050ef8, 0x25c371a8, 0xb251ddc3, 0xece0234e, 0x57316e1c, 0x5580ff4a, 0xe754fb22, 0xfa752ea1,
            0xf29a7d8f, 0x837aa2e1, 0xf79a3db4, 0xe9a0b278, 0x0b7e9a4c, 0x039b7d53, 0x19700cdd, 0xe468e2d5,
            0x4ef67429, 0x5f9a82b9, 0x14b1818e, 0x8ac4456f, 0xf4fcbd5f, 0xc25e5cbd, 0xca44fa25, 0x0cdbbc49,
            0x1e292d92, 0xecac0c7c, 0x0d6abbea, 0xa75d3b7e, 0x6a0ebfac, 0xa4b4d4e7, 0x5d05e427, 0x4d25b42f,
            0x2ee101b8, 0x7e6bbe0b, 0x2692810f, 0xa3bb41a5, 0x3c170aec, 0x64c29776, 0x9ec1de52, 0x073464d4,
            0xd2334a19, 0xb11ecbfb, 0xc2fb081e, 0xe5d3f11a, 0xf575161c, 0x2d5c8d94, 0x16ee97c0, 0xd860049b,
            0xd31b1d3e, 0x88e8d88c, 0xf8d2e782, 0xc5ce6d05, 0x52b3803d, 0xf668f35f, 0x4e5c5a25, 0x0f6ad5ec,
            0xcef38344, 0x33ac3c28, 0xec7b00a7, 0x2255a18e, 0x77731e06, 0x9ed38a19, 0x5f408d79, 0x0005df1c,
            0x3bf190f5, 0xe5cdbd6e, 0x33d7f6fd, 0xb539269e, 0xf8979097, 0xf773f555, 0xe3340f3b, 0x9eb34ff6,
            0x9992249e, 0x5a49e867, 0x3ab333df, 0x14c08f75, 0x69db660a, 0x6a6b7da7, 0x0802cb82, 0x9df83473,
            0xaa63b2af, 0x467cbfe6, 0x3a3da69e, 0x115ebe67, 0xba794938, 0x61ae6ceb, 0x12ddf6a5, 0x031dcbf5,
            0xf5794054, 0x33ec59b7, 0x22761015, 0x2fca22c0, 0x3d7aede0, 0x31817cf7, 0x81625a1c, 0xfd459b67,
            0xef53f4c2, 0xcf32c3ae, 0xf71212df, 0x017c285f, 0x45915348, 0xdcd3e3a3, 0x7b748de3, 0x85a214c3,
            0x4a8c3466, 0xdfba975d, 0x186cdf92, 0x458838e4, 0x517ce04e, 0x009ffdb6, 0xea38a017, 0xd638dba6,
            0x97a5afab, 0x3307c380, 0xcff6a21f, 0xe7f04e3b, 0x8458cdbb, 0x96817ff1, 0x70620b84, 0x9d9dd03c,
            0xc1b7a406, 0xbfcede98, 0x0718bcd6, 0xbf9c53f5, 0x3972f290, 0x2b4046c2, 0x1836dc39, 0xda22e544,
            0x3473c9a2, 0x565dc98a, 0x8070c75e, 0x3acd2646, 0xd7e67d98, 0xb8ab5499, 0xde9a6a6e, 0x06fd97d9,
            0xcbc6a963, 0x766721d4, 0xd9c14299, 0x276debdf, 0xeb878ecc, 0x25959871, 0x323b5703, 0x6fbc0a93,
            0x461cc59c, 0x440e4060, 0xc50f826b, 0xe7581f2b, 0x7fddb23f, 0xa8183462, 0x5a7d14a3, 0x63dae8eb,
            0x71759f0c, 0x174fe030, 0x191b931a, 0xd77d14b2, 0x2d5d1afe, 0x8926c797, 0x7a71d07e, 0x123a1174,
            0x825a0c0c, 0x4eb0f759, 0xbc5212ed, 0x84fbfbbc, 0x45bbf49f, 0x6a88813e, 0x02e1ccdd, 0x24ac0f33,
            0x4b66f93d, 0x2fda0d07, 0x2304c24f, 0xff91ee3e, 0x672d7bc9, 0xcf30569a, 0x896c75d0, 0x70033596,
            0x8d2f77ef, 0x84caf55c, 0x9a4912e1, 0x3abece82, 0x60d8ad30, 0xaefdd54b, 0xf8fd6fe8, 0x82a453c5,
            0x0780b4d5, 0x2fdb9b42, 0xb2f1f375, 0xeb423633, 0x906fc154, 0x83fa194b, 0x37f38f6f, 0x5935340b,
            0xac6c3195, 0xaaa2f683, 0xaec0ed11, 0x53dcbe65, 0xfc62691e, 0xfd63f19a, 0xbbff97e3, 0x676480a7,
            0x1acbf25b, 0x40d2634b, 0x776e9335, 0x1678f0f1, 0x46bc6731, 0x7f52d21d, 0xc16982d5, 0x1bb96de3,
            0x68cb511f, 0x829e142c, 0xf9fe3228, 0xfd62776e, 0x94857fc8, 0x70a9ca65, 0x42097c7b, 0x751a6c89,
            0x513c69f1, 0x2efdbaec, 0x6623bf47, 0xc36d8035, 0xd0837409, 0xbe55a333, 0xab4f3bdf, 0xa5b046c5,
            0xf7a37757, 0xe787f59e, 0x87913a54, 0x480a180d, 0x81a5ebd5, 0x511eb7ee, 0x12f5a8ab, 0x73447c1c,
            0xa164c28c, 0x57900661, 0xba9414fa, 0x3bf9ed82, 0xd86a6acd, 0x5b09f797, 0xa5663ec3, 0xc86cbf84,
            0xdcefc67c, 0x48a84c90, 0x5c745f28, 0xa8b236e0, 0xfbccb56a, 0x40383b3c, 0x6b238a05, 0x90eefdec,
            0x7e951a6c, 0x940e63a3, 0xf98ef893, 0x8c977a6e, 0x71c42456, 0x5d61332f, 0xea297f4b, 0xa9b252c0,
            0x3e97cb15, 0x48050881, 0xf5b264d2, 0x2be5347b, 0xef030ce9, 0x41f2c0bd, 0x04d24fe2, 0x06e7e1cf,
            0x01548902, 0x32c32925, 0xfb27d2b1, 0x6a360112, 0xfc79125c, 0x3a6bacbc, 0x987eebf4, 0xfc565822,
            0xf9ede83f, 0x4568ad7f, 0xf583840b, 0xa7eb1583, 0x90f031a4, 0x3b252d95, 0xb612a076, 0xb78783cf,
            0xe1f616ae, 0xbec3df2f, 0xd0c58988, 0x00ab849e, 0xdec160fb, 0xb77b7645, 0x2e0c857e, 0x61c65b1e,
            0xc4889032, 0x7112c73b, 0x114dbae6, 0xa0145c70, 0xb9958cd7, 0x7a318fb8, 0xebe7ae55, 0xdb9d9621,
            0xe4f27eee, 0xe4435669, 0xc80091a9, 0xbaa569d3, 0xbe0e3758, 0x4097462e, 0xe1fec615, 0xd9e85d86,
            0x84291b04, 0x1ccf2614, 0xadef18d2, 0x719639bc, 0x82794162, 0x0282420f, 0xabdc9b1e, 0xdbd734c9,
            0xa89d747d, 0x91266431, 0x64a1d430, 0x5c3a1c2d, 0x0502cc98, 0xb2070762, 0x442dd308, 0xbf28564d,
            0xc68815ed, 0x3e4eda5c, 0x128b113f, 0x49b41127, 0x9a84ec0a, 0xa9bdfb30, 0x8a99056d, 0xa95de301,
            0x8d8b0982, 0x24f48723, 0xab3f376c, 0xcd89d8fe, 0x276b6c49, 0x15f00e90, 0x9f14da21, 0xe97407dd,
            0xeb33ae49, 0xd0811453, 0x0a10eea7, 0x2588a497, 0x575c1f87, 0x5141ae48, 0x6eaaccbc, 0x159ce14e,
            0x0a9d6ddb, 0xed91259a, 0x4b23e675, 0xd1671bcc, 0x28beae5a, 0xc6ed5424, 0x9e88e390, 0x214494c8,
            0x23da4138, 0x87053bd5, 0xb9d03560, 0xf6a99473, 0x72a153c4, 0xf94c20b7, 0x70a7b274, 0xba274c89,
            0x767f6e53, 0x638da5da, 0xa23bf5d3, 0xc0c3b92e, 0x0fb97f72, 0xd9a25e94, 0xba7e4365, 0x909cffc5,
            0xc7bba836, 0xc2684d34, 0x2dee53e7, 0xdd75d5bb, 0xbd7458a7, 0x8e810115, 0xc5a84a82, 0x12c3edf4,
            0x941d772c, 0x4a153ba6, 0xbdd1d73e, 0x3b7755b7, 0xa208da2a, 0xb2f24ecf, 0x22bc87b0, 0xd3baa4b4,
            0xe033a60f, 0xfef480aa, 0xc4a3eb4b, 0x77a87092, 0x42f40429, 0xb09c304c, 0x640044a6, 0xff901800,
            0x3b81b734, 0xf9926fdb, 0xb825317c, 0x6a2a1c29, 0x4f33ecc0, 0xe0a3e7cb, 0x8f2c3191, 0xe4c25344,
            0x62d6d81a, 0x8deb3647, 0x8c8a8674, 0xcac73002, 0x4372b23d, 0xbe4a30e3, 0x25fd3466, 0x3202e33a,
            0x0fbb0725, 0x1019bb09, 0x0e5c92af, 0x6e82ff5d, 0x39db8dc3, 0x901eeaeb, 0xa05712a9, 0x1630a239,
            0xef88227f, 0x93fe8ec2, 0xe0e21c3b, 0x7200598e, 0x52d14e13, 0x84b35afe, 0xa32dd8a6, 0x47ea13bc,
            0x280b5ce2, 0x99410c2e, 0x961e54fe, 0xda53ac4b, 0x7ce9a3d4, 0x50f03b76, 0x14325768, 0x8c0cc024,
            0x2390ddb9, 0x026c576a, 0xc5881d73, 0xe4a9ffea, 0x6db0629a, 0xdd6c0421, 0xdccaaa6e, 0x1368c821,
            0xbf593da9, 0x2cbf7423, 0x02167699, 0x74f9fae5, 0xb5374a5f, 0x8d794559, 0xaac940b3, 0xac8d2452,
            0xf70f6d6d, 0xffc598a9, 0x2ffae518, 0x64a19d54, 0xd5d35698, 0xb0802198, 0x4aab10ea, 0x79aa57fd,
            0xce39bcc1, 0x38866f22, 0x94982f77, 0x95ebf8c1, 0xa761fcff, 0xa7bf1657, 0xfdcad5cc, 0x7691f346,
            0x12e6e3f5, 0x762b4344, 0xa2f14a2a, 0xa710ee06, 0x1675f6ed, 0xaec92100, 0x1a1a81cd, 0x7836dc15,
            0x31128a6f, 0x94272ed4, 0x693553f2, 0xf72ee615, 0xf311074b, 0x2fd354a2, 0x2cf6d090, 0x9c87ae3a,
            0xc8ead3c4, 0xce07766b, 0x425fa6d5, 0x3f9e735b, 0x0a865da1, 0x729e0347, 0xe450b189, 0xd5560f8c,
            0x387de83d, 0x364794dd, 0x79c4fe6d, 0xee112e73, 0x09e99443, 0x5039d959, 0x7ba8d125, 0xc8588993,
            0xd0810ccf, 0x13eb6b47, 0x89e8bae1, 0xbd061f53, 0xa409cfb2, 0xa4f7fbeb, 0x568e8046, 0x75693036,
            0x9be660d4, 0xda3f8e86, 0x9e1b90dc, 0xc023e24d, 0x7e82e39a, 0x62f2ea10, 0x523f0663, 0xa7a72d64,
            0x2636e7cf, 0x4dbe27a7, 0x64d1ed4a, 0xcb55f7a0, 0x06dae206, 0xb56e68ca, 0x3539b098, 0x0e395df1,
            0x83b6bfe4, 0xb6cd4f6a, 0xab50a3bd, 0x72edfe15, 0x1f8515bd, 0xe495a19a, 0x9d46df4f, 0xf488013f,
            0x4d1f9fdc, 0x971d292e, 0xc572615a, 0xe401572b, 0xd59a0b3c, 0x0658da8f, 0x60768ddb, 0xa9943e19,
            0xc3a18a20, 0x285ec952, 0xc4776f99, 0x9f1eb4e3, 0xe42e9536, 0x887e4b47, 0xf9136d85, 0xbf533be2,
            0x86d74a20, 0xe0d6c774, 0x552caece, 0xe7bc30e6, 0xfc80517a, 0x5e6bdd58, 0xb1c46c72, 0x0e8dc32a,
            0xb5444136, 0xe9b46133, 0xb2f60032, 0x7dce7daf, 0xba4a0116, 0x03480b79, 0x3495a197, 0x2ecf3b56,
            0x4fe86542, 0x2e83dbaa, 0x06906bf2, 0xd2d77b7a, 0x898117c1, 0x362b57c8, 0xe2257d0b, 0xeee583d2,
            0x6fbf1761, 0xfb3a1d2a, 0x18ad48a1, 0x1ae0ab8b, 0x4fd0242e, 0x909eb19b, 0x759f039f, 0x43a2e2b2,
            0x3c08c8ce, 0x8a6699a6, 0xa1c4bd34, 0xb21aafab, 0x472b70ee, 0x1e29db1c, 0x2762d2c7, 0xcd312ec0,
            0xf653e8eb, 0x5ef39eb7, 0x0a3c253c, 0xc5fc1f49, 0x95894cc3, 0x7fb8bc3f, 0x716c7bdf, 0x794a2a9a,
            0x8dcb3652, 0x35faf233, 0xcb605201, 0xf3ce4060, 0xf8bae3bd, 0x8feaa345, 0x3d52e33f, 0x2367b6b9,
            0x6dae73c7, 0xc7247d46, 0xe44280cf, 0xbff900fb, 0x6a590053, 0xed4f734b, 0x45cfad5d, 0x8817d88d,
            0x2ddc30ed, 0x324a17f9, 0xcdcbb3cb, 0x5ae05e7f, 0x89844b49, 0x31ea7a9e, 0x8982a99c, 0xe2a10114,
            0xadb655a1, 0xd820908a, 0x828ca7c7, 0x44cad636, 0x70fadfe7, 0x5ebf1018, 0x72b586e6, 0x315e60b3,
            0x9540cd5a, 0x2756b8c0, 0xc0d24fbc, 0xb4941c20, 0xfb2575c6, 0xacc7fc8b, 0x75b1f87c, 0x9dd7303f,
            0xf1bcd180, 0x30930381, 0x957288c6, 0x829cd6b6, 0x65451d04, 0x17bc4afc, 0x221421ae, 0x5b33489a,
            0x9d999adb, 0x04c89542, 0xe2a97f88, 0xd8dc0202, 0xbbb1fe02, 0xfa8cd2ff, 0x8b9f628d, 0x0f2ec94c,
            0xe5dc328d, 0xe538b905, 0xa9512e86, 0x211bec69, 0xf54ef592, 0xd3b87def, 0x739d3e47, 0x2cf040fb,
            0xa89f7e32, 0x2175f03d, 0x35aa1a3e, 0x7b7d1595, 0x8b118b51, 0x3f0e7231, 0x31bc24e6, 0x01057bc5,
            0x3c074f2e, 0xf799896a, 0x189ee136, 0xdd07f1f8, 0x71f4afa9, 0x55f1ef6b, 0xe20e1209, 0x6142479a,
            0xb9271402, 0xcc610aed, 0x7e3cab0e, 0xca27138b, 0x8b1cc8a3, 0xce0192c9, 0xac153ded, 0x55ca1523,
            0xcaf7a020, 0xbfa450bd, 0xfd4c968a, 0xf18b7cd8, 0x36b2d54a, 0xdd569890, 0x559a8a83, 0xe69abaff,
            0x1248baa7, 0xc4a10e27, 0xfbabffb3, 0x1a67d584, 0xaf197632, 0x515c7c01, 0x623e0185, 0x92407512,
            0x5cf012ab, 0xa9329d01, 0xd5c5ad74, 0xe7e92fba, 0x287c0aaa, 0xa6466ada, 0x61072e3d, 0x63096658,
            0x9c9f33a4, 0x208aaacc, 0x40afb9d2, 0x95182939, 0xd691b81b, 0x49810ea8, 0xdecbc1f3, 0x821283c6,
            0x5dd139c9, 0x04f1c5ed, 0xd4cb9520, 0x3711aaff, 0x1b4a1cad, 0xf5982481, 0xf92bdd32, 0x062c3092,
            0x908d1eb0, 0x597f5f99, 0xdb8b3203, 0x0fafd4f4, 0xd07212b1, 0x00a44adc, 0xbf2e210a, 0xfa9d9413,
            0xa6fad16d, 0x1a8abe34, 0x51c1c640, 0xa4e2434d, 0xba04acfe, 0xf5b7b040, 0x3f237988, 0x26621ed6,
            0xb964f65e, 0xf0d2079b, 0xb0499b7b, 0x85f487c2, 0x1e42fa26, 0xb0debd68, 0x483b9ebf, 0x8c7046a0,
            0xb03e8050, 0xf18e3072, 0xdfd63c33, 0xd2f2b783, 0x833697a8, 0xf33b8fb6, 0xe73d9440, 0xff64a238,
            0x353fc592, 0x5590801a, 0x2b79cde8, 0x54aacfa7, 0xccf98129, 0x23aad0c4, 0x6482d132, 0x206c6673,
            0x2775a133, 0x8f8859ca, 0xcbb95277, 0x4ae57aaf, 0xa47cbf5f, 0xbcb0bc6c, 0x90f565fa, 0x1cd23ba5,
            0x2ad6ef24, 0x8764cc36, 0xb684ef70, 0x7e8d6183, 0x87087822, 0x9f8c3f85, 0xcba572e9, 0xf8f84147,
            0xe99ec2d8, 0xda1606fd, 0xaf04573f, 0xa551905b, 0xf41694b8, 0x986bbf8d, 0x07bfda33, 0x6e9951dc,
        };

        RandomAssert.assertEquals(expectedSequence, rng);
    }
}
